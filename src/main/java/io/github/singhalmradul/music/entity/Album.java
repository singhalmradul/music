package io.github.singhalmradul.music.entity;

import io.github.singhalmradul.music.entity.types.Copyright;
import io.github.singhalmradul.music.entity.types.ExternalIds;
import io.github.singhalmradul.music.entity.types.ExternalUrls;
import io.github.singhalmradul.music.entity.types.Image;
import io.github.singhalmradul.music.entity.types.Restrictions;
import io.github.singhalmradul.music.entity.types.Tracks;

/**
 * An album
 */
public class Album {

    /**
     * The type of album.
     */
    private String albumType;
    /**
     * The number of tracks in the album.
     */
    private int totalTracks;
    /**
     * The markets in which the album is available: ISO 3166-1 alpha-2 country
     * codes. <b><i>NOTE:</i></b> an album is considered available in a market when
     * at least 1 of its tracks is available in that market.
     */
    private String[] availableMarkets;
    /**
     * Known external URLs for this album.
     */
    private ExternalUrls externalUrls;
    /**
     * A link to the Web API endpoint providing full details of the album.
     */
    private String href;
    /**
     * The Spotify ID for the album.
     */
    private String id;
    /**
     * The cover art for the album in various sizes, widest first.
     */
    private Image[] images;
    /**
     * The name of the album. In case of an album takedown, the value may be an
     * empty string.
     */
    private String name;
    /**
     * The date the album was first released.
     */
    private String releaseDate;
    /**
     * The percision with releaseDate value is known
     */
    private String releaseDatePrecision;

    private Restrictions restrictions;
    /**
     * The object type.
     */
    private String type;
    /**
     * The Spotify URI for the album.
     */
    private String uri;
    /**
     * The copyright statements of the album.
     */
    private Copyright[] copyrights;
    /**
     * Known external IDs for the album.
     */
    private ExternalIds externalIds;
    /**
     * A list of genres the album is associated with. If not yet classified, the
     * array is empty.
     */
    private String[] genres;
    /**
     * The label associated with the album.
     */
    private String label;
    /**
     * The popularity of the album. The value will be between 0 and 100, with 100
     * being the most popular.
     */
    private int popularity;
    /**
     * The artists of the album. Each artist object includes a link in href to more
     * detailed information about the artist.
     */
    private Artist[] artists;
    /**
     * The tracks of the album.
     */
    private Tracks tracks;

    /**
     * @return the albumType
     */
    public String getAlbumType() {
        return albumType;
    }

    /**
     * @param albumType the albumType to set
     */
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    /**
     * @return the totalTracks
     */
    public int getTotalTracks() {
        return totalTracks;
    }

    /**
     * @param totalTracks the totalTracks to set
     */
    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
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
     * @return the images
     */
    public Image[] getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(Image[] images) {
        this.images = images;
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
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the releaseDatePrecision
     */
    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    /**
     * @param releaseDatePrecision the releaseDatePrecision to set
     */
    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
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
     * @return the copyrights
     */
    public Copyright[] getCopyrights() {
        return copyrights;
    }

    /**
     * @param copyrights the copyrights to set
     */
    public void setCopyrights(Copyright[] copyrights) {
        this.copyrights = copyrights;
    }

    /**
     * @return the externalIds
     */
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    /**
     * @param externalIds the externalIds to set
     */
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    /**
     * @return the genres
     */
    public String[] getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the popularity
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * @param popularity the popularity to set
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    /**
     * @return the artists
     */
    public Artist[] getArtists() {
        return artists;
    }

    /**
     * @param artists the artists to set
     */
    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    /**
     * @return the tracks
     */
    public Tracks getTracks() {
        return tracks;
    }

    /**
     * @param tracks the tracks to set
     */
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }
}
