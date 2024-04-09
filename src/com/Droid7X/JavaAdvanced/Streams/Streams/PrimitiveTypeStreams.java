package com.Droid7X.JavaAdvanced.Streams.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveTypeStreams {
    public static void main(String[] args) {
        IntStream.of(1,2,3);

        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);




    }
}
