package io.github.singhalmradul.music.entity;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.singhalmradul.music.entity.types.Followers;
import io.github.singhalmradul.music.entity.types.Genre;
import io.github.singhalmradul.music.entity.types.Image;
import io.github.singhalmradul.music.entity.types.SimplifiedArtist;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist extends SimplifiedArtist {
    /**
     * Information about the followers of the artist.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "followers")
    @JsonProperty("followers")
    private Followers followers;
    /**
     * A list of the genres the artist is associated with. If not yet classified,
     * the array is empty.
     */
    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "artist_genre", joinColumns = @JoinColumn(name = "artist_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    @JsonProperty("genres")
    private List<Genre> genres;
    /**
     * Images of the artist in various sizes, widest first.
     */
    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
    @JsonProperty("images")
    private List<Image> images;

    /**
     * The popularity of the artist. The value will be between 0 and 100, with 100
     * being the most popular. The artist's popularity is calculated from the
     * popularity of all the artist's tracks.
     */
    @Column(name = "popularity")
    @JsonProperty("popularity")
    private int popularity;

    /**
     * @return the genres
     */
    public List<Genre> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    /**
     * @return the followers
     */
    public Followers getFollowers() {
        return followers;
    }

    /**
     * @param followers the followers to set
     */
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    /**
     * @return the images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(Image[] images) {
        this.images = Arrays.asList(images);
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
}
