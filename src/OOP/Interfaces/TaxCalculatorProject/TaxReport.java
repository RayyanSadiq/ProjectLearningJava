package OOP.Interfaces.TaxCalculatorProject;

public class TaxReport {

    private BaseTaxCalculator calculator;

    public TaxReport(BaseTaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void showTax() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}