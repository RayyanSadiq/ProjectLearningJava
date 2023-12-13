package JavaAdvanced.Streams.Streams;



import java.util.List;
import java.util.stream.Stream;

public class MappingElements {
    public static void main(String[] args) {
        var movies = List.of(
                new Movie("Abs",10),
                new Movie("Door", 21),
                new Movie("Monster Hunter",1000)
        );


        movies.stream()
                .map(movie -> movie.getName())
                .forEach(System.out::println);

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(System.out::println);

        Stream<List<Integer>> stream = Stream.of(List.of(1,23,31), List.of(2,3,1));
        stream
            .flatMap(list -> list.stream())
            .forEach(System.out::println);

    }
}
