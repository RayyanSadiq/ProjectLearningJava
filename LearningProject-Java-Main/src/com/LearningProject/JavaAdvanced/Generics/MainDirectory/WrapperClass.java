package com.LearningProject.JavaAdvanced.Generics.MainDirectory;

public class WrapperClass {
    public static void main(String[] args) {
        var list = new GenericList<>() ; // the Generic class only takes reference types as arguments, not primitive types
        // To solve this problem, in java we have something called a wrapper class for each of the primitive types,
        //examples:
        //int --> Integer class
        //boolean --> Boolean class
        //double --> DoubleClass

        // Now how these work is that a Integer class stores a integer type in it.
        var intList = new GenericList<Integer>();
        intList.add(1); // now over here we are passing an integer value, but it is getting wrapped in inside a class
        // we call this process boxing
        int number = intList.get(0); // now in this case, java is going to extract the integer value stored in the integer
        // object, this is called unboxing.


    }

}
