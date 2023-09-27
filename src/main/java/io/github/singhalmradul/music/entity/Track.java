package io.github.singhalmradul.music.entity;

import io.github.singhalmradul.music.entity.types.ExternalIds;
import io.github.singhalmradul.music.entity.types.ExternalUrls;
import io.github.singhalmradul.music.entity.types.Image;

public class Track {
    Album album;
    Artist[] artists;
    String[] availableMarkets;
    int discNumber;
    int durationMs;
    boolean explicit;
    ExternalIds externalIds;
    ExternalUrls externalUrls;
    String href;
    String id;
    Image[] images;
    int popularity;
    String type;
    String uri;
}
