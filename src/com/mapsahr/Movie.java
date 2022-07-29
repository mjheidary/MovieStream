package com.mapsahr;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private int year;
    private String imdb;
    private List<Genre> genres;
    private Director director;

    public Movie(String title, int year, String imdb) {
        this.title = title;
        this.year = year;
        this.imdb = imdb;
    }

    public Movie() {
    }

    public Movie(int id, String title, int year, String imdb) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imdb = imdb;
    }

    // getters and setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", year=" + year + "]";
    }
}
