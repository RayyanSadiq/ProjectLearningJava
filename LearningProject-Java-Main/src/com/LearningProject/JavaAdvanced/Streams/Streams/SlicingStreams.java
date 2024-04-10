package com.LearningProject.JavaAdvanced.Streams.Streams;

import java.util.List;

public class SlicingStreams {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("jagg",322),
                new Movie("ragg",4530),
                new Movie("wrogg",1553)
        );

        System.out.println(".limit() method demonstration");
        movies.stream()
                .limit(2)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\n.skip() method demonstration");
        movies.stream()
                .skip(1)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\n.takeWhile() method demonstration");
        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 4000)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("\n.dropWhile() method demonstration");
        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 4000)
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
