package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {

    HashMap<String,Movie> movieHashMap = new HashMap<>();
    HashMap<String,Director> directorHashMap = new HashMap<>();
    HashMap<String,List<String>> pairHashMap = new HashMap<>();
    public void addMovie(Movie movie) {
        movieHashMap.put(movie.getName(), movie);
    }

    public void addDirector(Director director) {
        directorHashMap.put(director.getName(), director);
    }

    public void addMovieDirectorPair(String movie, String director) {
        if(pairHashMap.containsKey(director)){
            pairHashMap.get(director).add(movie);
        }else{
            List<String> list = new ArrayList<>();
            list.add(movie);
            pairHashMap.put(director,list);
        }
    }

    public Movie getMovieByName(String name) {
       return movieHashMap.get(name);
    }

    public Director getDirectorByName(String name) {
        return directorHashMap.get(name);
    }

    public List<String> getMovieByDirectorName(String director) {
        return pairHashMap.get(director);
    }

    public List<String> findAllMovies() {
        List<String> list = new ArrayList<>();
        for(String s:movieHashMap.keySet()){
            list.add(s);
        }
        return list;
    }

    public void deleteDirectorByName(String name) {
        List<String> list = pairHashMap.get(name);
        for(String s:list){
            movieHashMap.remove(s);
        }
        directorHashMap.remove(name);
        pairHashMap.remove(name);
    }

    public void deleteAllDirector() {
        for (String directorName:pairHashMap.keySet()) {
            deleteDirectorByName(directorName);
        }
    }
}
