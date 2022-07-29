package com.mapsahr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // set Genre
        Genre dram = new Genre(1, "dram");
        Genre action = new Genre(2, "action");
        Genre love = new Genre(3, "love");
        Genre police = new Genre(4, "police");


        //set Director
        Director ali = new Director(1, "Ali", "6.2");
        Director reza = new Director(2, "Reza", "5");

        //set Movie
        Movie aliBaba = new Movie(1, "AliBaba", 1992, "5.9");
        Movie aliClay = new Movie(2, "aliClay", 2000, "6.5");
        Movie rezaNik = new Movie(3, "rezaNik", 2003, "4.9");

        //set movie of each director
        ali.setMovies(new ArrayList<>(Arrays.asList(aliBaba, aliClay)));
        reza.setMovies(new ArrayList<>(Arrays.asList(rezaNik)));

        //set Genre of each movie
        aliBaba.setGenres(new ArrayList<>(Arrays.asList(dram, action)));
        aliClay.setGenres(new ArrayList<>(Arrays.asList(action, police)));
        rezaNik.setGenres(new ArrayList<>(Arrays.asList(love)));


        //Find the number of movies of each director
        System.out.println(ali.getMovies().stream().count());
        System.out.println(reza.getMovies().stream().count());
        List<Director> directors=new ArrayList<>(Arrays.asList(ali,reza));
        directors.stream().forEach(e-> System.out.println(e.getMovies().size()));

        //Find the number of genres of each director's movies
        System.out.println(ali.getMovies()
                .stream()
                .map(e -> e.getGenres()
                        .stream()
                        .map(Genre::getName))
                .flatMap(Stream::distinct)
                .distinct()
                .count());
        System.out.println(reza.getMovies()
                .stream()
                .map(e -> e.getGenres()
                        .stream()
                        .map(Genre::getName))
                .flatMap(Stream::distinct)
                .distinct()
                .count());
    }
}
