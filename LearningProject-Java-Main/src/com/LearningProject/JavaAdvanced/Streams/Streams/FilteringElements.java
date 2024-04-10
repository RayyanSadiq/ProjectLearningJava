package com.LearningProject.JavaAdvanced.Streams.Streams;

import java.util.List;
import java.util.function.Predicate;

public class FilteringElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("Drone",32),
                new Movie("jk",33),
                new Movie("mosh",100)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 34)
                .forEach(movie -> System.out.println(movie.getName()));

        Predicate<Movie> hasO = movie -> movie.getName().contains("o");

        movies.stream()
                .filter(hasO)
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
