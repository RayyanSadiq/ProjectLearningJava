package com.Droid7X.JavaAdvanced.LambdaExpressions.TheProblemAndOldSolution;

public class ConsolePrinter implements Printer { // To use the interface we have to make a whole separate class
    // and then instantiate the class. This is not ideal and is a lot of excess code, we can cut this down using
    // anonymous inner classes, better yet lambda expressions
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
