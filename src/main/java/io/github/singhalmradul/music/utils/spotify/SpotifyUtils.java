package io.github.singhalmradul.music.utils.spotify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.singhalmradul.music.dao.SpotifyAccessTokenDao;

@Component
public class SpotifyUtils {
    private SpotifyAccessToken spotifyAccessToken;
    private SpotifyAccessTokenDao spotifyAccessTokenDao;
    private String authRequestHeader;

    /**
     * @param spotifyAccessTokenDao
     */
    public SpotifyUtils(SpotifyAccessTokenDao spotifyAccessTokenDao) {
        this.spotifyAccessTokenDao = spotifyAccessTokenDao;
        refreshSpotifyAccessToken();
    }

    private void refreshSpotifyAccessToken() {
        if ((spotifyAccessToken = spotifyAccessTokenDao.getLatest()) == null)
            requestAcessToken();
        authRequestHeader = String.format("%s %s", spotifyAccessToken.getTokenType(),
                spotifyAccessToken.getAccessToken());
    }

    private void requestAcessToken() {
        try {
            URL url = new URL("https://accounts.spotify.com/api/token");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestMethod("POST");
            con.setDoOutput(true);

            Dotenv dotenv = Dotenv.load();
            String body = String.format("grant_type=client_credentials&client_id=%s&client_secret=%s",
                    dotenv.get("SPOTIFY_CLIENT_ID"), dotenv.get("SPOTIFY_CLIENT_SECRET"));
            byte[] outputInBytes = body.getBytes("UTF-8");
            OutputStream os = con.getOutputStream();
            os.write(outputInBytes);
            os.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            spotifyAccessToken = new ObjectMapper().readValue(content.toString(),
                    SpotifyAccessToken.class);
            spotifyAccessTokenDao.save(spotifyAccessToken);

            System.out.println("Content: " + content.toString());

        } catch (IOException e) {
            System.out.println("\033[1;91m" + e.getMessage() + "\033[0m");
        }

    }

    public String getAuthRequestHeader() {
        if (spotifyAccessToken.isExpired())
            refreshSpotifyAccessToken();
        return authRequestHeader;
    }
}
