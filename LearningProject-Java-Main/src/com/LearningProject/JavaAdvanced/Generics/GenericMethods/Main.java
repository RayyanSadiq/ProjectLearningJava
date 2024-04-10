package com.LearningProject.JavaAdvanced.Generics.GenericMethods;

import com.LearningProject.JavaAdvanced.Generics.TheComparableInterface.User;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(2,4); // since generics can take in and return any data type, it's good to initialize
        // the variables as "var" type since it will become the data type of whatever it is being assigned to.
        System.out.println(max);

        var max1 = Utils.max(new User(10), new User(20));
        System.out.println(max1);

        Utils.print("hey",123);


    }
}
