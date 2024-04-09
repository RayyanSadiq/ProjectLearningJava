package com.Droid7X.JavaAdvanced.Exceptions.ThorwingExceptions;

import java.io.IOException;

public class AccountClass {

    private int balance;
    public void deposit (double money) throws IOException { //Keep in mind that the "throws exception" is actually part of the method's signature
        if (money <= 0) { // this type of validating the logic is called defensive programming.
            // Defensive programming os when we throw any Exception with the validation of the input.
            // perform this validation logic only when getting inputs from the user or external systems.
            // So Defensive programming should be applied at the boundary of the application, not within the application
            // itself.
            throw new IOException( "deposit cannot be below zero");
        }
    }
    public void withdraw (double money) throws AccountException { // when a checked error is thrown we clarify it with the
        // method by putting "throws SomeException"

        if (money > balance) {
            throw new AccountException(new InsufficientFundsException()); // here we are chaining exceptions, as
            // the InsufficientFundsException is the cause of the AccountException for being thrown
        }
    }
}
