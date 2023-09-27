package io.github.singhalmradul.music.entity.types;

public class ExternalIds {
    /**
     * International Standard Recording Code
     */
    private String isrc;
    /**
     * International Artical Number
     */
    private String ean;
    /**
     * Universal Product Code
     */
    private String upc;

    /**
     * @return the isrc
     */
    public String getIsrc() {
        return isrc;
    }

    /**
     * @param isrc the isrc to set
     */
    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    /**
     * @return the ean
     */
    public String getEan() {
        return ean;
    }

    /**
     * @param ean the ean to set
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    /**
     * @return the upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * @param upc the upc to set
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }
}
