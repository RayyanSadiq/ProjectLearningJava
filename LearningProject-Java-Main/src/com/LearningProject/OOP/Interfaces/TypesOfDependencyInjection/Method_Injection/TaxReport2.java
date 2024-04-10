package com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.Method_Injection;

import com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.TaxCalculator;

public class TaxReport2 {


    public void showTax(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}