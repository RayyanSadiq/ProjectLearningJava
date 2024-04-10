package com.LearningProject.JavaBasics.JavaPreIntro;

public class BasicJavaAnatomy { // public is a type of access modifier which means if it is accessible or
    // not to other methods or classes. "class" defines the main class of this script. The main class must be always
    // named after the file name.

    // Classes start with a '{' and must close with '}'.

    // Classes use the PascalNamingConvention - All the first letters of a word are capitalized
    // Methods use the camelNamingConvention - only the first letter of the first word is lowercase

    public static void main(String[] args) {  // This is how we define a method in java. A method in java is a function
        // in a class. Coding languages like python can have functions outside of classes. static is something we'll
        // cover later. Void is a return-type value that returns nothing, hence void. To execute code, we must make a
        // "main" method. The first letter of "main" must always be lower cased. The first method must always have (String[]
        // args) in the parameters.
        System.out.print("Hello world"); // System.out.print is the statement that prints out a value on to the console
        // prompt. All java statements must end with a semicolon.

        System.out.println("!"); // System.out.println prints out the NEXT output on the next line.
        System.out.print("Next line");

    } // end curly braces for method

} // end curly braces for Class