package OOP.Interfaces.TaxCalculatorProject;

public interface CanTaxCalculator { // interfaces determine the public contract of a class, what public methods a class
    // should have. Interfaces cannot be instantiated like normal classes. An Interface is a contract, not a concrete
    // Implementation.

    public double calculateTax();
}
