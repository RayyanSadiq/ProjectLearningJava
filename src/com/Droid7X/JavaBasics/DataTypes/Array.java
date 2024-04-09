package com.Droid7X.JavaBasics.DataTypes;

import java.util.Arrays; // import Arrays to get array specific methods
public class Array {
    public static void main(String[] args){

        String  [] array = new String[5];
        // An array is basically a STATIC list of items that can be any data type however after creating the array, and it's
        // properties, it cannot be altered in any way beside changing the values it holds, hence why it is called static list,
        // due to it being unchangeable.

        // The syntax for arrays is basically the same as making an object, except that you add [] after data type in the
        // declaration and after the data type specifier in the initialization.


        array[1] = "wer"; // Arrays values can be changes by referring a certain index who values of which you want to change
        System.out.println(array);
        System.out.println(Arrays.toString(array)); //To print out arrays, you must use the "toString" method from the "Array" class
        // to print out

        int [] array2 = {1,2,56,32,2};
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2); // here we can sort the values within an array
        System.out.println(Arrays.toString(array2) + '\n');


        int [][][] multidimensionalArray = new int[2][2][2]; // multidimensional arrays can be declared by adding more brackets per dimension
        multidimensionalArray[0][1][0] = 222;
        System.out.println(Arrays.deepToString(multidimensionalArray)); // instead of "toString", we use "deepToString"
        // to convert a multidimensional array to a readable string
        int [][] multidimensional_array2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(multidimensional_array2));

    }
}
