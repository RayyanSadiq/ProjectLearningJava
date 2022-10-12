package JavaBasics;

import java.lang.ref.Reference;

public class Data_Types {
    public static void main(String[] args) {
        // Primitive type data
        byte Primitive_type1 = 127; //bytes take up a space of one byte and the range for them is number -128 to 127
        short Primitive_type2 = 32000; // shorts take up a space of 2 bytes and the range is -32k to 32k
        int Primitive_type3 = 2000000000; // shorts take up a space of 4 bytes and the range is -2b to 2b
        long Primitive_type4 = 2100000000; // shorts take up a space of 8 bytes and the range is large
        float Primitive_type5 = 2134; // float take up a space of 4 bytes and the range is 1.175494351 E - 38 to 3.402823466 E + 38
        double Primitive_type6 = 1.2334333; // double take up a space of 8 bytes and the range is 64bit
        char Primitive_type7 ='e'; // char take up a space of 2 bytes and the range comprises universal letters
        // chars are defined only within single quotes.
        boolean Primitive_type8 = true; // booleans take up a space of 1 byte, and they are a true or false value

        // Reference data types
        // an important rule of Reference data types is that they need to be capitalized when referenced.
        // Memory allocation in java mainly has two things, the heap where objects are stored and the stack where
        // variables are stored. Primitive types are stored in the stack with the variable their assigned to. However,
        // variables that hold objects are still in the stack, but the object is in the heap, this is why there called
        // reference types because they refer to an object in the heap.

        String Reference_type1 = "This is a string"; // Strings are only defined in double quotes and are 8 bytes big

        
    }

}
