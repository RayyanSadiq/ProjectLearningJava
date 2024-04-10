package com.LearningProject.JavaBasics.ControlFlow;

public class For_Loops {
    public static void main(String[] args) {

        // Example of a for loop that iterates from 1 to 5 and prints each iteration.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Attempt . . . " + i); // Print the iteration number
        }

        System.out.println("\n"); // Print a newline for separation

        // Example of a for loop that iterates backwards through an array of color pencils.
        String[] color_pencils = {"red", "blue", "yellow"};
        for (int i = 0; i < color_pencils.length; i--) {
            // This loop is designed to go in reverse, but it will result in an infinite loop because 'i' decrements on each iteration.
            System.out.println(color_pencils[i]); // Print each color pencil
        }

        System.out.println("\n"); // Print a newline for separation

        // Example of a for-each also called enhanced-for loop that iterates through an array of color pencils.
        for (String pencil : color_pencils) {
            System.out.println(pencil); // Print each color pencil
        }



    }

}
