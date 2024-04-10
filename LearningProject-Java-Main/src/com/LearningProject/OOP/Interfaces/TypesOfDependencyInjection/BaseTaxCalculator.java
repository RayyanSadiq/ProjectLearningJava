package com.LearningProject.OOP.Interfaces.TypesOfDependencyInjection;

public class BaseTaxCalculator implements TaxCalculator {
    private double taxableIncome;

    public BaseTaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override //Apply override annotation to interface methods.
    // The override annotation implements the calculateTax() method and helps check for if method is in Implementation and
    // if the signature is the same.
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
