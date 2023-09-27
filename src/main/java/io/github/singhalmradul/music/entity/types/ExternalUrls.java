package io.github.singhalmradul.music.entity.types;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "external_urls")
public class ExternalUrls {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "external_urls_id")
    private UUID externalUrlsId;

    /**
     * The Spotify URL for the object.
     */
    @Column(name = "spotify")
    private String spotify;

    /**
     * @return the spotify
     */
    public String getSpotify() {
        return spotify;
    }

    /**
     * @param spotify the spotify to set
     */
    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }
}
