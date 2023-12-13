package JavaAdvanced.Streams.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,21};
        Arrays.stream(numbers)
                .forEach(System.out::println);

        Stream.of(1,21,23,3);

        var stream = Stream.generate(Math::random);
        stream
                .limit(3)
                .forEach(System.out::println);

        Stream.iterate(1, number -> number+12)
                .limit(3)
                .forEach(System.out::println);
    }
}
