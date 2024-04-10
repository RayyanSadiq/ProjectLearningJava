package com.LearningProject.JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinarayOperatorInterface {
    public static void main(String[] args) {

        BinaryOperator<Integer> add =  (a,b )-> a+b;
        Function<Integer,Integer> square = a -> a * a;
        System.out.println(add.andThen(square).apply(2,2));




    }
}
