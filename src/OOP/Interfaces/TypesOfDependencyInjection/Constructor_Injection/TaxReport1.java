package OOP.Interfaces.TypesOfDependencyInjection.Constructor_Injection;

import OOP.Interfaces.TypesOfDependencyInjection.TaxCalculator;

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