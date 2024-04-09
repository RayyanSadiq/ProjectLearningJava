package com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.Setter_Injection;

import com.Droid7X.OOP.Interfaces.TypesOfDependencyInjection.BaseTaxCalculator;

public class MainSetterInjection {
    public static void main(String[] args) {
        var calculator = new BaseTaxCalculator(89);
        var report = new TaxReport3(calculator);

        report.setCalculator(new BaseTaxCalculator(123));








    }
}
