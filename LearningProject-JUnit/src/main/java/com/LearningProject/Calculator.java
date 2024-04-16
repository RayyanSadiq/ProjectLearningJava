package com.LearningProject;

public class Calculator {

    public static int add(int ...numbers){
        int count = 0;
        for (int number : numbers) {
            count += number;
        }
        return count;
    }
}
