package io.github.singhalmradul.music.entity.types;

public class Copyright {
    /**
     * The copyright text for this content.
     */
    private String text;
    /**
     * The type of copyright: C = the copyright, P = the sound recording
     * (performance) copyright.
     */
    private String type;

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
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
}
