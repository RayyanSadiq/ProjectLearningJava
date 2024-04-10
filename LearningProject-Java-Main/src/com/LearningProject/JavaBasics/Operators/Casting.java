package com.LearningProject.JavaBasics.Operators;

public class Casting {
    public static void main(String[] args) {
       // implicit casting
       // This is when a smaller data type can fit into a larger data_type, therefore not allowing any data to be loosed
       // byte -> short -> int -> long -. double -> float
       byte var1 = 12;
       int var2 = var1 + 100000 ;
       long var3 = var2 + 23000000000L;



       //Explicit casting
        double var4 = 2.22;
        int var5 = 3 + (int)var4;
        double var6 = 1.3;
        int var7 = (int)var4 + 3; // here we are trying to perform an operation between two data types which are not
        // compatible, to fix this, we perform casting which is to change or cast a new data type to an existing variable
        // or value. We just cast var4 from a double type to becoming an integer data type. This means that var4 will be
        // truncated and turn in to 1 instead of 1.3. This type of casting is called "Down com.Droid7X.JavaBasics.Operators.Casting" because we are casting
        // it to a lower data type.
        System.out.println(var5);

        String var8 = "123";
        int var9 = Integer.parseInt(var8) + 30; // here we are parsing the string and casting the String value to an
        // integer data type
        System.out.println(var9);

    }
}
