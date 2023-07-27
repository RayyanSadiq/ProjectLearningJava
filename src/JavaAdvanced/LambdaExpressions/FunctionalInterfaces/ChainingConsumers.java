package JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ChainingConsumers {
    public static void main(String[] args) {
        List<String> list = List.of("fire","water","thunder","dragon","ice");

        Consumer<String> print = item -> System.out.println(item); // making cosumer objects that do a certain task
        // make naming very specific and obvious
        Consumer<String> printUppercase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUppercase)); // pass on the functional interface in forEach method. andThen is
        // how we chain Consumers together

        Consumer<String> uppercase = item -> System.out.println(item.substring(0,1).toUpperCase()+ item.substring(1));
        list.forEach(uppercase);









    }
}
