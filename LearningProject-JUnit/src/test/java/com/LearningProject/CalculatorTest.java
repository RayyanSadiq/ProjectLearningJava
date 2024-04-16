package com.LearningProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canAddNumbers(){
        Calculator testCalculator = new Calculator();
        int number1 = 10;
        int number2 = 20;

        assertEquals(30,number1 + number2 );
    }
}
