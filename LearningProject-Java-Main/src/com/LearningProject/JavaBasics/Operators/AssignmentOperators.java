package com.LearningProject.JavaBasics.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // The = is also an operator called the assignment operator, However they are other assignment opertors as well.

        int a = 1;
        a = a + 2;  // gives 3
        a +=2;  // gives 5
        // this is a shortcut for what above, this is called an augmented assignment operator. This does exactly on what's
        // happening on a's initialization.

        int b = 1;
        b = b - 2; // gives -1
        b -=2; // gives - 3

        int c = 1;
        c = c * 2; // gives 2
        c *=2; // gives 4

        int d = 1;
        d = d/2; // gives 0
        d /=2; // still gives 0.

        // here you would expect a value of 0.5, but since it is an integer variable it will truncate or
        // remove all the number after the decimal point. It will not round it up, it will only remove the value after
        // the decimal leaving the answer to be the whole number before the decimal point, this will make y = 0.

        int e = 1; // Here we are use the modulus operator, this just gives the remainder.
        e = e%2; // gives  1
        e %=2; // gives 1
    }
}
