package JavaAdvanced.Exceptions.ThorwingExceptions;

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

            throw e; // here we are re-throwing an error and catching it on the main class to let the user know something
            // wrong happened.
        }
    }

    public static void show2() throws IOException {
        var account = new AccountClass();
        System.out.println("Logging");

        try {
            account.withdraw(9); // checked exceptions must be checked by the method calling it if it is thrown
            // inside the called method

        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage()); // here we are re-throwing an error and catching it on the main class to let the user know something
            // wrong happened.
        }
    }
}
