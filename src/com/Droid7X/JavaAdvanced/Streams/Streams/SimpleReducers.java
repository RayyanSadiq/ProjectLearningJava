package com.Droid7X.JavaAdvanced.Streams.Streams;

import java.util.Comparator;
import java.util.List;

public class SimpleReducers {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("wheat",322),
                new Movie("potato",4530),
                new Movie("ratha",1553)
        );

        var count = movies.stream()
                .count();
        System.out.println(count);

        var containsWheat = movies.stream()
                .anyMatch(movie -> movie.getName().equals("wheat"));
        System.out.println(containsWheat);

        var containsA = movies.stream()
                .allMatch(movie -> movie.getName().contains("a"));
        System.out.println(containsA);

        var containsZ = movies.stream()
                .noneMatch(movie -> movie.getName().contains("z"));
        System.out.println(containsZ);

        var isListNull = movies.stream()
                .findFirst()
                .get();
        System.out.println(isListNull);

        var randomElement = movies.stream()
                .findAny(); //returns a random element from the list
        System.out.println(randomElement);

        var maxValue = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(maxValue);

        var minValue = movies.stream()
                .min(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(minValue);

    }
}
