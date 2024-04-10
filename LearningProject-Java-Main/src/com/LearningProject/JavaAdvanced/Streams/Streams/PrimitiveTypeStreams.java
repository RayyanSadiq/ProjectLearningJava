package com.LearningProject.JavaAdvanced.Streams.Streams;

import java.util.stream.IntStream;

public class PrimitiveTypeStreams {
    public static void main(String[] args) {
        IntStream.of(1,2,3);

        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);




    }
}
