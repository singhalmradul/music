package io.github.singhalmradul.music.utils.spotify.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.singhalmradul.music.entity.Artist;
import io.github.singhalmradul.music.utils.spotify.SpotifyUtils;

@Repository
class SpotifyArtistDaoImpl implements SpotifyArtistDao {

    private SpotifyUtils spotifyUtils;

    /**
     * @param spotifyUtils
     */
    public SpotifyArtistDaoImpl(SpotifyUtils spotifyUtils) {
        this.spotifyUtils = spotifyUtils;
    }

    @Override
    public Artist findById(String id) {
        try {
            URL url = new URL(String.format("https://api.spotify.com/v1/artists/%s", id));
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty("Authorization", spotifyUtils.getAuthRequestHeader());
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            System.out.println("Status: " + status);
            System.out.println("Content: " + content.toString());
            return new ObjectMapper().readValue(content.toString(), Artist.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
