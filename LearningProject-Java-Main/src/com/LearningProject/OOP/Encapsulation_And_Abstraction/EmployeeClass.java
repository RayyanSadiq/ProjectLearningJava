package com.LearningProject.OOP.Encapsulation_And_Abstraction;

public class EmployeeClass {

    private int baseSalary; // private makes the field only accessible in the class
    private int extraHours; // all fields should generally be private

    private static int numberOfEmployees;

    /* static members are fields and methods that belong to the class, not the objects
    or instances created with the class. The methods and fields that do not have static are only for the objects
    created, which is why only objects can access them, hence we call them instance members.
    We use static members to represent a concept that should be in a single place, like numberOfEmployees.
    you can think of static members as the fields and methods for the class itself*/


    public EmployeeClass () {
        this(10000,0);
    }
    public EmployeeClass (int baseSalary) { /* over here we are using constructor over loading to take in a different
        number of parameters. To accomplish this we use the same logic as the second constructor and use it here by
        referring to it as "this", since "this" represents the current object. So we use "this()" and give in 2
        parameters to call the original constructor that takes in two arguments and give in a default value to the
        parameter not filled .*/
        this(baseSalary,0);
    }


    public EmployeeClass (int baseSalary, int extraHours) { // here we have constructor with two parameters, we use the
        // setters logic inside here to make sure the given values that are given to the constructor are valid.
        setBaseSalary(baseSalary);
        setExtraHours(extraHours);
        numberOfEmployees++; // everytime an Employee object is created, we increment the value by 1.
    }

    public static void printNumberOfEmployees() {
        System.out.println("You have " + numberOfEmployees + " Employees "); /* we print out the number of employee
        objects */

        // static members cannot access non-static members, you have to create an object inside the method and access
        // it from there.

    }

    public int calculateWage(int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);
    }


    public void setBaseSalary (int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be zero or less"); // This causes an error when salary is
            // less than zero
        }
        this.baseSalary = baseSalary;
    }

    // Getters are usually public, but since we are not using these, we are hiding them with private, making the class UI
    // more clean

    public int getBaseSalary () { // we're going to turn this method to private to reduce coupling and making the ui
        // simpler
        return baseSalary;
    }

    public void setExtraHours (int extraHours) {
        if (extraHours < 0) {
            throw new IllegalArgumentException(" hours cannot be below zero"); // This causes an error when extraHours
            // is less than zero.
        }
        this.extraHours = extraHours;
    }

    private int getExtraHours () {
        return extraHours;
    }


}
