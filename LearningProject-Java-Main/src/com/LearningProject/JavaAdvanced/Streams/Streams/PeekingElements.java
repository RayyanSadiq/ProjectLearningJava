package com.LearningProject.JavaAdvanced.Streams.Streams;

import java.util.List;

public class PeekingElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("a",322),
                new Movie("sd",4530),
                new Movie("f",1553)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 500)
                .peek(movie -> System.out.println("filtered " +movie.getName()))
                .map(Movie::getName)
                .peek(name -> System.out.println("mapped " + name))
                .forEach(System.out::println);
    }
}
