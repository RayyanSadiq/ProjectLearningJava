package JavaAdvanced.Streams.ImperativeVSFunctional;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Movie> list = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );


        // Imperative Programming - How something should be done
        int count = 0;
        for(var item : list){
            if (item.getLikes()>10){
                count++;
            }
        }

        // Declarative programming (Functional Programming) - What needs to be done

        // Streams were introduced in java to process a collection of data in a declarative, or more accurately
        // A functional way

        // Functional programming is a specialized type of declarative programming, but brings with it additional
        // concepts

        list.stream()
                .filter(movie -> movie.getLikes()>10)
                .count();

    }
}
