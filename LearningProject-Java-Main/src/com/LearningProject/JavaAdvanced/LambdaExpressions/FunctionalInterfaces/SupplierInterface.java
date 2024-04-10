package com.LearningProject.JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<Double> random = () -> Math.random(); // This functional interface supplies a value without taking any value
        System.out.println(random.get()); // We use the built in "get" method in supplier objects to retrieve the value.

    }
}
