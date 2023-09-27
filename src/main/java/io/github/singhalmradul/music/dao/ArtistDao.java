package io.github.singhalmradul.music.dao;

import io.github.singhalmradul.music.entity.Artist;

public interface ArtistDao {
    Artist findById(String id);

    void save(Artist artist);
}
