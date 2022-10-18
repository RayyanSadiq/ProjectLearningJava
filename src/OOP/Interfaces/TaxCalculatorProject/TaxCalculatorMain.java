package OOP.Interfaces.TaxCalculatorProject;

public class TaxCalculatorMain {
    public static void main(String[] args) {

        var calculator = new BaseTaxCalculator(1000);
        var taxReport = new TaxReport(calculator);
    }
}
