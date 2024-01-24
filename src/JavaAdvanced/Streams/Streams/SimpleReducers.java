package JavaAdvanced.Streams.Streams;

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

        var s = movies.stream()
                .count();
        System.out.println(count);

    }
}
