package io.github.singhalmradul.music.entity.types;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="followers")
public class Followers {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "followers_id")
    private UUID followersId;
    /**
     * @return the followersId
     */
    public UUID getFollowersId() {
        return followersId;
    }

    /**
     * @param followersId the followersId to set
     */
    public void setFollowersId(UUID followersId) {
        this.followersId = followersId;
    }

    /**
     * This will always be set to null, as the Web API does not support it at the moment.
     */
     @Column(name="href")
     private String href;
    /**
     * The total number of followers.
     */
    @Column(name="total")
    private int total;

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
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
