package com.LearningProject.JavaSmallProjects;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = input.nextInt();


        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(number);
        }
    }
}
