package io.github.singhalmradul.music.entity.types;

public class SimplifiedTrack {
    /**
     * The artists who performed the track. Each artist object includes a link in
     * href to more detailed information about the artist.
     */
    private SimplifiedArtist[] artists;
    /**
     * A list of the countries in which the track can be played, identified by their
     * ISO 3166-1 alpha-2 code.
     */
    private String[] availableMarkets;
    /**
     * The disc number (usually 1 unless the album consists of more than one disc).
     */
    private int discNumber;
    /**
     * The track length in milliseconds.
     */
    private int durationMs;
    /**
     * Whether or not the track has explicit lyrics ( true = yes it does; false = no
     * it does not OR unknown).
     */
    private boolean explicit;
    /**
     * External URLs for this track.
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
     * Part of the response when Track Relinking is applied. If true, the track is
     * playable in the given market. Otherwise false.
     */
    private boolean isPlayable;
    /**
     * Part of the response when Track Relinking is applied and is only part of the
     * response if the track linking, in fact, exists. The requested track has been
     * replaced with a different track. The track in the linked_from object contains
     * information about the originally requested track.
     */
    private LinkedFrom linkedFrom;

    private Restrictions restrictions;
    /**
     * The name of the track.
     */
    private String name;
    /**
     * A URL to a 30 second preview (MP3 format) of the track.
     */
    private String previewUrl;
    /**
     * The number of the track. If an album has several discs, the track number is
     * the number on the specified disc.
     */
    private int trackNumber;
    /**
     * Thoe object type: "track".
     */
    private String type;
    /**
     * The Spotify URI for the track.
     */
    private String uri;
    /**
     * Whether or not the track is from a local file.
     */
    private boolean isLocal;
    /**
     * @return the artists
     */
    public SimplifiedArtist[] getArtists() {
        return artists;
    }

    /**
     * @param artists the artists to set
     */
    public void setArtists(SimplifiedArtist[] artists) {
        this.artists = artists;
    }

    /**
     * @return the availableMarkets
     */
    public String[] getAvailableMarkets() {
        return availableMarkets;
    }

    /**
     * @param availableMarkets the availableMarkets to set
     */
    public void setAvailableMarkets(String[] availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    /**
     * @return the discNumber
     */
    public int getDiscNumber() {
        return discNumber;
    }

    /**
     * @param discNumber the discNumber to set
     */
    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * @return the explicit
     */
    public boolean isExplicit() {
        return explicit;
    }

    /**
     * @param explicit the explicit to set
     */
    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
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
     * @return the isPlayable
     */
    public boolean isPlayable() {
        return isPlayable;
    }

    /**
     * @param isPlayable the isPlayable to set
     */
    public void setPlayable(boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    /**
     * @return the linkedFrom
     */
    public LinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    /**
     * @param linkedFrom the linkedFrom to set
     */
    public void setLinkedFrom(LinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    /**
     * @return the restrictions
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * @param restrictions the restrictions to set
     */
    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
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
     * @return the previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * @param previewUrl the previewUrl to set
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * @return the trackNumber
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * @param trackNumber the trackNumber to set
     */
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
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

    /**
     * @return the isLocal
     */
    public boolean isLocal() {
        return isLocal;
    }

    /**
     * @param isLocal the isLocal to set
     */
    public void setLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * @return the durationMs
     */
    public int getDurationMs() {
        return durationMs;
    }

    /**
     * @param durationMs the durationMs to set
     */
    public void setDurationMs(int durationMs) {
        this.durationMs = durationMs;
    }
}
