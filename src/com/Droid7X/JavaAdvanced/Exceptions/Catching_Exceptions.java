package com.Droid7X.JavaAdvanced.Exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Catching_Exceptions { // An exception is an object that contains information about an error

    /* There are three types of exceptions:
    - Checked exceptions are exceptions that are checked by the compiler at compile time, we should ALWAYS catch these
    - Unchecked exceptions occur during the runtime of the program, do not catch these, they are intended to signal programming mistakes
    - errors which is the third type of exception, which indicates an error external to our application like out of
      memory errors or stack overflow
    */
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");

        }
        catch (FileNotFoundException ex) { // in case you want to address each specific exception with a unique catch, you
            // make separate catches, however the first exception that comes up will execute the first catcher that corresponds with its
            // type of error and will not execute any code after where the exception has occurred in the "try" block and any
            // other "catch" block will not be executed.

            // Also keep in mind that if an exception that is a derivative of another exception is placed second behind
            // the parent exception, it will cause an error, so order does matter, which means we want to put the more
            // general exceptions last, with the more specific exception catchers first. The FileNotFoundException is a derivative of
            // the IOException, which means if the catcher for IOException is above the FileNotFoundException, their will be a
            // compile time error
            System.out.println("file not found");
        }
        catch (IOException ex) { // FileNotFoundException is a part of the IOException, so if you want throw a same catcher for
            // both errors, you could just only catch IOException error.
            System.out.println("File nope");
        }
        catch (ParseException ex) { // You could combine errors into one catcher using a vertical bar like this:
            // catch (IOException | ParseException ex) in case you want to deal with all exceptions the same way.
            System.out.println("hey no parsing");
        }

    }

}
