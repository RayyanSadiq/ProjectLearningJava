package com.LearningProject.JavaAdvanced.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class try_with_resources {
    public static void show() {



        try(
            var reader = new FileReader("file.txt") // here is what we call a "try with resources" statement
            // it will close all resources  given in the parameters at the end of the "try and catch" block. It will
            // do what we basically did with the final block file
        ) {
            var value = reader.read();
        }
        catch (IOException ex) {
            System.out.println("could not read data");
        }

    }
}
