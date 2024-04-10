package com.LearningProject.JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = a -> a*a;
        System.out.println(square.apply(2));

    }
}
