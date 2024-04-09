package com.Droid7X.JavaAdvanced.Exceptions.ThorwingExceptions;

import java.io.IOException;

public class Library {
    public static void show1() throws IOException {
        var account = new AccountClass();
        System.out.println("Logging");
        account.deposit(12);

        try {
            account.deposit(-12); // checked exceptions must be checked by the method calling it if it is thrown
            // inside the called method

        } catch (IOException e) {
            System.out.println("Logging"); // here we are pretending to log the exception.
            throw e; // here we are re-throwing an error and logging it, then rethrowing again, however keep in mind their
            // is no point of rethrowing in the first place is you don't plan on doing anything while catching it, so if
            // I were not logging it right now, then I would not be rethrowing at all.
        }
    }

    public static void show2() throws IOException {
        var account = new AccountClass();
        System.out.println("Logging");

        try {
            account.withdraw(9); // checked exceptions in a method must be caught by the method calling it
            // if it is thrown inside the called method

        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage()); // here we are printing the message of our custom exception
        }
    }
}
