package com.Droid7X.JavaAdvanced.Exceptions.ThorwingExceptions;

// If making a Checked -> extend from Exception Class
// If making an Unchecked (runtime) -> extend it form the RunTimeExceptionClass

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super("Insufficient funds in your class");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
