package com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.Constructor_Injection;

import com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection.BaseTaxCalculator;

public class MainConstructorInjection {
    public static void main(String[] args) {

        var calculator = new BaseTaxCalculator(1000);
        var taxReport = new TaxReport1(calculator);
        taxReport.showTax();

    }
}
