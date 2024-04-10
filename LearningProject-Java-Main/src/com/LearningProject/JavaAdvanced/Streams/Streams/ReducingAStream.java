package com.LearningProject.JavaAdvanced.Streams.Streams;

import java.util.List;

public class ReducingAStream {

    public static void main(String[] args) {
        var movies = List.of(
                new Movie("a",322),
                new Movie("b",4530),
                new Movie("c",1553)
        );

        Integer sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0,Integer::sum);

        System.out.println(sum);

    }
}
