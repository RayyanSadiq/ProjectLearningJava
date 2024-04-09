package com.Droid7X.JavaAdvanced.Streams.Streams;

import java.util.Comparator;
import java.util.List;

public class SortingStreams {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("as",44),
                new Movie("cf",13),
                new Movie("bh",234)
        );

        movies.stream()
                .sorted((mov1, mov2) -> mov1.getName().compareTo(mov2.getName()))
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\n");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getName)) // this code is equivalent to the code above, but more
                // concise
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\n");
        movies.stream()
                .sorted(Comparator.comparing(Movie::getName).reversed())
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
