package com.Droid7X.JavaAdvanced.Streams.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningData {

    public static void main(String[] args) {
        var movies = List.of(
                new Movie("a",322),
                new Movie("b",4530),
                new Movie("c",1553)
        );

        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 500,
                        Collectors.mapping(Movie::getName,
                                Collectors.joining(", "))));

        System.out.println(result);

    }

}
