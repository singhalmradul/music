package io.github.singhalmradul.music.entity.types;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class SimplifiedArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="artist_id")
    private UUID artistId;
    /**
     * Known external URLs for this artist.
     */
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "external_urls")
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;

    /**
     * A link to the Web API endpoint providing full details of the artist.
     */
    @Column(name = "href")
    @JsonProperty("href")
    private String href;

    /**
     * The Spotify ID for the artist.
     */
    @Column(name = "spotify_id")
    @JsonProperty("id")
    private String id;
    /**
     * The name of the artist.
     */
    @Column(name = "name")
    @JsonProperty("name")
    private String name;
    /**
     * The object type.
     */
    @Column(name = "type")
    @JsonProperty("type")
    private String type;
    /**
     * The Spotify URI for the artist.
     */
    @Column(name = "uri")
    @JsonProperty("uri")
    private String uri;
    /**
     * @return the artistId
     */
    public UUID getArtistId() {
        return artistId;
    }
    /**
     * @param artistId the artistId to set
     */
    public void setArtistId(UUID artistId) {
        this.artistId = artistId;
    }

    /**
     * @return the externalUrls
     */
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    /**
     * @param externalUrls the externalUrls to set
     */
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    /**
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }
}
