package com.LearningProject.JavaBasics.Operators;

public class Arithmetic_operations {
    public static void main(String[] args) {
        int x = 2;
        double y = 6;

        // For doing arithmetic operations in code, we use arithmetic operators which are:

        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulus
        // ++ addition
        // -- subtraction
        // % modulus

        // we use these operators on operands, which basically means numbers

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);


        //-------------------------------------------Arithmetic error-------------------------------------------------//
        //System.out.println(1 / 0);

        // Important thing to note is that this will cause an error since its 1/0. A variable that's not a double, will
        // raise this error, however explicitly casting this to a double to fix this problem is considered a bad practice.
        // keep in mind 0/1 will not raise an error since they are zero ones inside in a zero.

        //------------------------------------------------------------------------------------------------------------//

        //Two last operators that are very useful are the increment operator (++), and the subtractive operator (--)

        int w = 2;
        int m = 6;

        System.out.println(w--);; // this prints w as 2 then minuses 1 after that
        System.out.println(--w); // this minuses w first then prints it as 0
        System.out.println(m++); // this prints m as 6 then adds 1 after that
        System.out.println(++m); // this adds m first then prints it as 8

    }
}
