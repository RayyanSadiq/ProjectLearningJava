package JavaSmallProjects.EmployeeWage;

public class EmployeeClass {

    private int baseSalary; // private makes the field only accessible in the class
    private int extraHours;

    public EmployeeClass (int baseSalary, int extraHours) {
        setBaseSalary(baseSalary);
        setExtraHours(extraHours);
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
