package com.LearningProject.JavaBasics.ControlFlow;

public class DoWhileLoops {
    public static void main(String[] args) {
        int count = 1; // Initialize a variable 'count' with a value of 1

        // Example of a do-while loop
        System.out.println("Do-While Loop Example:");
        do {
            System.out.println("Count: " + count);
            count++; // Increment 'count' by 1
        } while (count <= 5);

        System.out.println("Loop ended.");
    }

    // In a do-while loop, the condition is checked after the execution of the loop's body.
    // This means that the loop's body will always execute at least once, even if the condition is initially false.


}
