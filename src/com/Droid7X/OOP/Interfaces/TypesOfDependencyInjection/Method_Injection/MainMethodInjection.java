package com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.Method_Injection;

import com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.BaseTaxCalculator;

public class MainMethodInjection {
    public static void main(String[] args) {
        var calculator = new BaseTaxCalculator(12);
        var taxReport = new TaxReport2();

        taxReport.showTax(calculator);
        taxReport.showTax(new BaseTaxCalculator(1000));

    }
}
