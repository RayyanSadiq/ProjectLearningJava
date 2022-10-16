package OOP.Interfaces.TaxCalculatorProject;

public class TaxReport {

    private TaxCalculator calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator(1000);
    }

    public void showTax() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}