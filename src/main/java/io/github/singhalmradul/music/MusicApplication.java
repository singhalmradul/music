package io.github.singhalmradul.music;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.singhalmradul.music.dao.ArtistDao;
import io.github.singhalmradul.music.entity.Artist;
import io.github.singhalmradul.music.utils.spotify.dao.SpotifyArtistDao;

@SpringBootApplication
public class MusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ArtistDao artistDao, SpotifyArtistDao spotifyArtistDao) {
		return runner -> {
			artistDao.save(findArtistById(spotifyArtistDao));
		};
	}

	private Artist findArtistById(SpotifyArtistDao spotifyArtistDao) {
		return spotifyArtistDao.findById("06HL4z0CvFAxyc27GXpf02");
	}
}
