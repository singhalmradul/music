package io.github.singhalmradul.music.dao;

import org.springframework.stereotype.Repository;

import io.github.singhalmradul.music.entity.Artist;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
class ArtistDaoImpl implements ArtistDao {
    private EntityManager entityManager;

    public ArtistDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Artist findById(String id) {
        return entityManager.find(Artist.class, id);
    }

    @Override
    @Transactional
    public void save(Artist artist) {
        entityManager.persist(artist);
    }
}
