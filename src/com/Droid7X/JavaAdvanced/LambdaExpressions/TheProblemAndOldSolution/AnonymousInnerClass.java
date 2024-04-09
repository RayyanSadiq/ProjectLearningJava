package com.Droid7X.JavaAdvanced.LambdaExpressions.TheProblemAndOldSolution;

public class AnonymousInnerClass {
    public static void show(){

        greet(new ConsolePrinter()); // So after making a class that makes the method, we then pass on an instance of that
        // class to this method. However sometimes we don't want to always make a class just to implement an interface, so
        // thats where we make an anonymous innerclass

        greet(new Printer() { // So this is an anonymous inner class. Its anonymous because it does not have a name, it is
            // just a implementation.
            @Override // We override the method from the interface
            public void print(String message) {
                System.out.println(message); // Give method implementation

                // This saves lines fo code, but Java 8 gave us a more concie and effcient way to do this, enter forth lambda expressions.
            }
        });
    }

    public static void greet(Printer printer){ // Here we are making a method that uses the functional interface
        // however there is still no implementation yet, we use the Anonymous inner class for that.
        printer.print("hello");
    }
}
