package io.github.singhalmradul.music.dao;

import java.util.List;

import io.github.singhalmradul.music.utils.spotify.SpotifyAccessToken;

public interface SpotifyAccessTokenDao {

    List<SpotifyAccessToken> findAll();

    void remove(SpotifyAccessToken spotifyAccessToken);

    void save(SpotifyAccessToken spotifyAccessToken);

    SpotifyAccessToken getLatest();

}
