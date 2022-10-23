package JavaAdvanced.Exceptions.ThorwingExceptions;

public class AccountException extends Exception{
    public AccountException(Exception cause) { // Here we are taking the cause of this more general purpose exception
        super(cause); // the cause of this exception is going to be another exception or another throwable object
        // so we pass that more specific exception here as the cause

        // So on initialization of this exception, the cause of this exception being passed to the Exception class, which
        // is the parent of this class
    }
}
