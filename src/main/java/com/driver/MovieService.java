package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository MovieRespository;

    public void addMovie(Movie movie) {

        MovieRespository.addMovie(movie);
    }

    public void addDirector(Director director) {
        MovieRespository.addDirector(director);
    }

    public void addMovieDirectorPair(String movie, String director) {
        MovieRespository.addMovieDirectorPair(movie,director);
    }

    public Movie getMovieByName(String name) {
        return MovieRespository.getMovieByName(name);
    }

    public Director getDirectorByName(String name) {
        return MovieRespository.getDirectorByName(name);
    }

    public List<String> getMovieByDirectorName(String director) {
        return MovieRespository.getMovieByDirectorName(director);
    }

    public List<String> findAllMovies() {
        return  MovieRespository.findAllMovies();
    }

    public void deleteDirectorByName(String name) {
        MovieRespository.deleteDirectorByName(name);
    }

    public void deleteAllDirectors() {
        MovieRespository.deleteAllDirector();
    }
}
