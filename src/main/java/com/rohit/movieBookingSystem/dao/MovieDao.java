package com.rohit.movieBookingSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rohit.movieBookingSystem.entities.Movie;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieDao extends JpaRepository<Movie, Integer> {
    public List<Movie> findByMovieName(String movieName);
    public List<Movie> findByMovieNameAndDuration(String name, int duration);
    public List<Movie> findByReleaseDateBetween(LocalDateTime start, LocalDateTime end);
    public List<Movie> findByDurationGreaterThanEqual(int duration);
    public List<Movie> findByReleaseDateAfter(LocalDateTime releaseDate);
    public List<Movie> findByMovieNameContaining(String movieName);
    public List<Movie> findByMovieNameIgnoreCase(String movieName);
}
