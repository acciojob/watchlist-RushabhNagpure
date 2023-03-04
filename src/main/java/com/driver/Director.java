package com.driver;

public class Director {
    private String name;
    private int numberOfMobvies;
    private double imdbRating;

    public Director(){

    }

    public Director(String name, int numberOfMobvies, double imdbRating) {
        this.name = name;
        this.numberOfMobvies = numberOfMobvies;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMobvies() {
        return numberOfMobvies;
    }

    public void setNumberOfMobvies(int numberOfMobvies) {
        this.numberOfMobvies = numberOfMobvies;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
