package OOP.Encapsulation_And_Abstraction;

public class EmployeeMain {

    // This code below is an example of Procedural programming

    /*
    public static void main(String[] args) {

        int baseSalary = 30_000;
        int extraHours = 10;
        int hourlyRate = 30;

        int wage = returnWage(baseSalary, extraHours, hourlyRate);
        //System.out.println(wage);


    }

    public static int returnWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + ( extraHours * hourlyRate);
    }
    */

    public static void main(String[] args) {

        var employee = new EmployeeClass( );
        EmployeeClass.printNumberOfEmployees();
        int wage = employee.calculateWage(30);
        System.out.println(wage);

    }

}
