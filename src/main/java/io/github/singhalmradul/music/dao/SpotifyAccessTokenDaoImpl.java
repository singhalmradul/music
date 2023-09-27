package io.github.singhalmradul.music.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.github.singhalmradul.music.utils.spotify.SpotifyAccessToken;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class SpotifyAccessTokenDaoImpl implements SpotifyAccessTokenDao {
    private EntityManager entityManager;

    public SpotifyAccessTokenDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<SpotifyAccessToken> findAll() {
        return entityManager.createQuery("FROM SpotifyAccessToken", SpotifyAccessToken.class).getResultList();
    }

    @Override
    @Transactional
    public void remove(SpotifyAccessToken spotifyAccessToken) {
        entityManager.remove(spotifyAccessToken);
    }

    @Override
    @Transactional
    public void save(SpotifyAccessToken spotifyAccessToken) {
        entityManager.persist(spotifyAccessToken);
    }

    @Override
    @Transactional
    public SpotifyAccessToken getLatest() {
        for (SpotifyAccessToken spotifyAccessToken : findAll()) {
            if (!spotifyAccessToken.isExpired())
                return spotifyAccessToken;
            else
                remove(spotifyAccessToken);
        }
        return null;
    }
}
