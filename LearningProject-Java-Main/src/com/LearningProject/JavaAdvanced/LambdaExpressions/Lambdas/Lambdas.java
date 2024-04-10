package com.LearningProject.JavaAdvanced.LambdaExpressions.Lambdas;

import com.LearningProject.JavaAdvanced.LambdaExpressions.TheProblemAndOldSolution.Printer;

public class Lambdas {

    public static String prefix = "-";
    public String suffix = ":";

    public Lambdas(String message){} // Constructor

    public static void showStatic (){
        greet(message -> { /*
             This is a lambda expression. The syntax for it is putting in the parameters and then using the
             lambda operator "->". Then we use curly braces to signify the creation of an anonymous method and pass the
             implementation in there. One good practice is that we remove parenthesis around the parameters if there is
             only one parameter. We put parenthesis only if they are none or more than one parameter.
            */
            System.out.println(message);
        });

        greet(message -> System.out.println(message)); // Here we simplify the code even further by removing the curly braces
        // since there is only 1 line of code and putting everything on the same line.

        // Accessing instance and static members from static context

        greet(message -> System.out.println(prefix + message)); // Unlike in anonymous inner classes we can access the
        // the enclosing class of a lambda expression and their fields and methods. Here we are accesing a static member
        // from a static context

        var example = new Lambdas("");
        greet(message -> System.out.println(message + example.suffix)); // this is how we access instance members from
        // a  static context.

    }

    public void showInstance (){

        // Accessing instance and static members from instance context
        greet(message -> System.out.println(suffix + message)); // We have access to static and instance members from
        // a instance context like this for both.
        greet(message -> System.out.println(prefix + message));

    }

    public static void printStatic(String message){}
    public void printInstance(String message){}

    public static void methodReferences(){

        greet(System.out::println); // referencing a method from another class

        greet(Lambdas::printStatic); // referencing static members

        var example = new Lambdas("");
        greet(example::printInstance); // referencing instance members

        greet(Lambdas::new); // referencing constructors
    }

    public static void greet(Printer printer){
        printer.print("hi human");
    }


}
