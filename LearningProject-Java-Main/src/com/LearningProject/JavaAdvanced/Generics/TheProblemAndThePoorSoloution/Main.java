package com.LearningProject.JavaAdvanced.Generics.TheProblemAndThePoorSoloution;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1); // So the object class is the parent of all reference types in java, but "1" is an integer, which
        // is a primitive type, so how could it be stored here? Well something to know is that each primitive types have
        // a wrapper class. The Integer class, which has the object class as one of it parents, has a method called
        // valueOf() which returns a new instance of the integer class. So what java does in the background is
        // list.add(Integer.valueOf(1)), more about this in the "Wrapper Class" file.
        list.add("String");
        list.add(new Object());

        int number = (int)list.get(0); // here our code is trying to get a value from the list and assign it as a
        // integer, the thing is, all values are upcasted to an Object type, so we would have to downcast them, hence the
        // (int), which makes the code more noisy. Then there is chance the value at the index we are trying to assign
        // to a int variable might not be an integer data type, so then that would cause a casting error, and we would
        // not know about it till runtime
        System.out.println(number);

        // Generic classes help us solve all these problems.
    }
}
