package com.LearningProject.JavaBasics.DataTypes;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        System.out.print("age: ");
        Scanner input = new Scanner(System.in); // prints in
        int age = input.nextInt();

        System.out.println("you are " + age); // Here we have something called concatenation which is to add a string
        // with another string or value which turned into a string via casting.

        System.out.print("Name: ");
        String name1 = input.next(); // input.next won;t print out the spaces or words after the first word
        System.out.println("you are " + name1); // Here we have something called concatenation which is to add a string
        // with another string or value which turned into a string via casting.

        Scanner input2 = new Scanner(System.in);
        System.out.print("Name: ");// We us input.nextLine to get every word in the variable
        String name2 = input2.nextLine().strip(); // deletes any whitespace on the left side of a string
        System.out.println("you are " + name2 );


    }
}
