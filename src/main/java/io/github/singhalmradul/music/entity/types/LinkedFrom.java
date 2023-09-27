package io.github.singhalmradul.music.entity.types;

public class LinkedFrom {
    /**
     * Known external URLs for this track.
     */
    private ExternalUrls externalUrls;
    /**
     * A link to the Web API endpoint providing full details of the track.
     */
    private String href;
    /**
     * The Spotify ID for the track.
     */
    private String id;
    /**
     * The object type: "track".
     */
    private String type;
    /**
     * The Spotify URI for the track.
     */
    private String uri;

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
