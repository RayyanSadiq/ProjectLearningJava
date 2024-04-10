package com.LearningProject.JavaBasics.DataTypes;

import javax.swing.*;

public class DataTypes {
    public static void main(String[] args) {

        // Primitive data types

        byte primitiveType1 = 127; //bytes take up a space of one byte and the range for them is number -128 to 127

        short primitiveType2 = 32000; // shorts take up a space of 2 bytes and the range is -32k to 32k

        int primitiveType3 = 2000000000; // shorts take up a space of 4 bytes and the range is -2b to 2b

        long primitiveType4 = 999999999999999999l; // shorts take up a space of 8 bytes and the range is large,
        // put suffix "L" at the end because even though we declared it as a long data type it still treats it as an integer by
        // default. Putting "L" will make it treat it like a long data type

        double primitiveType6 = 1.99999999999999; // double take up a space of 8 bytes and the range is 64bit

        float primitiveType5 = 2134.34F; // float take up a space of 4 bytes and the range is 1.175494351 E - 38 to 3.402823466 E + 38
        // put suffix "F" at the end because even though we declared it as a float data type it still treats it as an double by
        // default. Putting "F" will make it treat it like a float data type

        char primitiveType7 = '♥'; // char take up a space of 2 bytes and the range comprises universal letters
        // chars are defined only within single quotes.

        boolean primitiveType8 = true; // booleans take up a space of 1 byte, and they are a true or false value

    //----------------------------------------------------------------------------------------------------------------//

        // Reference data types

        // an important rule of Reference data types is that they need to be capitalized when using them. This is because
        // technically all reference types are objects, and object are instances of classes which use the PascalNamingConvention.
        // Memory allocation in java mainly has two things, the heap where objects are stored and the stack where
        // variables are stored. Primitive types are stored in the stack with the variable their assigned to. However,
        // variables that hold objects are still in the stack, but the object is in the heap, this is why there called
        // reference types because they refer to an object in the heap.

        String Reference_type1 = "This is string"; // Strings are only defined in double quotes and are 8 bytes big

        JFrame frame = new JFrame();
        // here the first word JFrame is DECLARING the data type JFrame to our variable named "frame". Then we go through a process
        // called INSTANTIATION , which is the process of making a new instance of a class and INITIALIZING that to our "frame"
        // variable. So in basic instantiating is the process of creating new objects. The new keyword is used to allocate memory
        // for our new class, we don't have to worry about releasing it as JRE has that covered. The last word JFrame() is
        // the object created from the class called JFrame. That's what classes do they are just blueprints for objects
        // to be created from, nothing else. This is why we say an object is an INSTANCE of a class.

        // One thing you might notice is how "frame" has other methods and members in it, this is because classes have members
        // while primitive types don't.

        // Your also probably wondering that if String is a reference type why does it not have an instantiation process and what not?
        // this because String is being instantiated already under the hood, Java is already doing this because String is used a lot, you can see below
        // the "new String" part is greyed out cause its redundant.


        String string = new String("Ka");
        System.out.println(string);

        
    }

}
