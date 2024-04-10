package com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.Setter_Injection;

import com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.TaxCalculator;

public class TaxReport3 {

    private TaxCalculator calculator;

    public TaxReport3(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void showTax() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;

    }
}