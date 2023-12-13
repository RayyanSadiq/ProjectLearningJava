package JavaAdvanced.Streams.Streams;

import java.util.List;

public class GettingUniqueElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("bowl",65),
                new Movie("soccer",65),
                new Movie("sword",92)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

    }
}
