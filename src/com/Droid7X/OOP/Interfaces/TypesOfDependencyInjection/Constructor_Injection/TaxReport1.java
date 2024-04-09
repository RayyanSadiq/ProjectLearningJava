package com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.Constructor_Injection;

import com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.TaxCalculator;

public class TaxReport1 {

    private TaxCalculator calculator;

    public TaxReport1(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void showTax() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}