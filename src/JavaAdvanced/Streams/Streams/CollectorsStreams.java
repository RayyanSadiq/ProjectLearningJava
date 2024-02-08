package JavaAdvanced.Streams.Streams;

import java.util.List;
import java.util.stream.Collectors;


public class CollectorsStreams {

    public static void main(String[] args) {
        var movies = List.of(
                new Movie("a",322),
                new Movie("b",4530),
                new Movie("c",1553)
        );

        var result = movies.stream()
                .filter(movie -> movie.getLikes() > 500)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
