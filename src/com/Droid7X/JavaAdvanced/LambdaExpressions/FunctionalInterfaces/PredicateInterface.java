package com.Droid7X.JavaAdvanced.LambdaExpressions.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<String> isLongerThen5 = str -> str.length() > 5;
        Predicate<String> isLessThen10 = str -> str.length() < 10;

        Predicate<String> isLongerThen5AndisLessThen10 = isLongerThen5.and(isLessThen10);
        System.out.println(isLongerThen5AndisLessThen10.test("Hello !"));
    }
}
