package com.Droid7X.JavaBasics.ControlFlow;

import java.util.Scanner;

public class While_loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = " ";
        while (true) { // Over here we have a while loop which we use when we don't know how much times
            // we want our code to repeat. Since strings are a reference type, we cannot use (input = "quit"), because
            // that  only compares the address or location of the reference types, not the actual value. So what we do
            // is use the reference method "Reference.equals(value)" to compare if values are the same or not. We can
            // put ! at the beginning of it to make it "not equal to".
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase(); // lowers teh user's input all to lowercase
            if (input.equals("pass")) {
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

        System.out.println("\n");

        do { // here we have another type of while loop called "do-while loops' which makes it so that the block of code
            // is processed at least once before the while condition comes. Usually we use while loops for the most case
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
