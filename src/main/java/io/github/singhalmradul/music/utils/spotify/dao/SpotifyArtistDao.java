package io.github.singhalmradul.music.utils.spotify.dao;

import io.github.singhalmradul.music.entity.Artist;

public interface SpotifyArtistDao {
    Artist findById(String id);
}
