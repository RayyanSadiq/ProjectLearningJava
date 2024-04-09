package com.Droid7X.JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.List;

public class ConsumerInterfaces {
    // The consumer interface is an operation that takes in an argument, but does not return a value.
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4); // lit of integers

        // Imperative programming (for, if-else,while)
        // This paradigm uses logic to implement instructions
        for (Integer item : list){
            System.out.println(item);
        }

        // Declarative programming
        // Instead of saying how it should be done, ths paradigm specifies what should be done
        list.forEach(item->System.out.println(item));
        //list.forEach(System.out::println);  // whats happening here is the exact same for whats happening above



    }
}
