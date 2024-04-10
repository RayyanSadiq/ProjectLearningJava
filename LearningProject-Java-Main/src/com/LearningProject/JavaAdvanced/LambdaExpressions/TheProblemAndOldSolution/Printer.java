package com.LearningProject.JavaAdvanced.LambdaExpressions.TheProblemAndOldSolution;

public interface Printer { // An interface with a single abstract method is called a functional interface. Examples of
    // functional interfaces are comparable and comparator interface because they have one abstract method.

    // Some interfaces have other methods that have implementation, which is not a good practice because interfaces
    // should only carry capabilities of a class not implementation. However, even if a interface have these other types
    // of methods they will still be counted as a functional interfaces as long as they have at least ONE abstract interface


    void print (String message);

}
