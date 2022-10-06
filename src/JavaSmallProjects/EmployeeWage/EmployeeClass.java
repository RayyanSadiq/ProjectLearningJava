package JavaSmallProjects.EmployeeWage;

public class EmployeeClass {

    private int baseSalary; // private makes the field only accessible in the class
    private int extraHours;

    private static int numberOfEmployees;

    /* static members are fields and methods that belong to the class, not the objects
    or instances created with the class. The methods and fields that do not have static are only for the objects
    created, which is why only objects can access them, hence we call them instance members.
    We use static members to represent a concept that should be in a single place, like numberOfEmployees.*/


    public EmployeeClass () {
        this(10000,0);
    }
    public EmployeeClass (int baseSalary) {
        this(baseSalary,0);
    }

    public EmployeeClass (int baseSalary, int extraHours) {
        setBaseSalary(baseSalary);
        setExtraHours(extraHours);
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
        // static members cannot access non-static members, you have to create an object inside the method and access
        // it from there.
    }

    public int calculateWage(int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary (int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be zero or less");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary () { // we're going to turn this method to private to reduce coupling and making the ui
        // simpler
        return baseSalary;
    }

    public void setExtraHours (int extraHours) {
        if (extraHours < 0) {
            throw new IllegalArgumentException(" hours cannot be below zero");
        }
        this.extraHours = extraHours;
    }

    private int getExtraHours () {
        return extraHours;
    }


}
