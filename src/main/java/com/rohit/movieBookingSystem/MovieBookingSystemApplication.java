package com.rohit.movieBookingSystem;

import com.rohit.movieBookingSystem.dao.MovieDao;
import com.rohit.movieBookingSystem.entities.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class  MovieBookingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MovieBookingSystemApplication.class, args);

		MovieDao movieDao = ctx.getBean(MovieDao.class);
		System.out.println("Hello spring boot");

		Movie movie = new Movie();
		movie.setMovieName("Keshari");
		movie.setMovieDescription("Very very nice movie");
		movie.setReleaseDate(LocalDateTime.of(2019, 4, 27, 4,5,30));
		movie.setDuration(150);
		movie.setCoverPhotoUrl("cover-photo-url");
		movie.setTrailerUrl("trailer-url");

		System.out.println("Movie object before storage " + movie);
		Movie savedObject = movieDao.save(movie);
		System.out.println("Saved object " + savedObject);

	}

}
