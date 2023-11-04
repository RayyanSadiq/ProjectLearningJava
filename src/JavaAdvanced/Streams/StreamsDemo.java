package JavaAdvanced.Streams;

import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Movie> list = List.of(
                new Movie("a",10),
                new Movie("b",15),
                new Movie("c",20)
        );


        // Imperative Programming
        int count = 0;
        for(var item : list){
            if (item.getLikes()>10){
                count++;
            }
        }

        // Declarative programming (Functional Programming)
        // FunctionaL programming is a specialized type of declarative programming
        list.stream()
                .filter(movie -> movie.getLikes()>10)
                .count();
    }
}
