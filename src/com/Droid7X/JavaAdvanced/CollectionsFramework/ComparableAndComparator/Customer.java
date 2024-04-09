package com.Droid7X.JavaAdvanced.CollectionsFramework.ComparableAndComparator;

public class Customer implements Comparable<Customer> {

    private String name;
    private String email;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer object) {
        return name.compareTo(object.name); // here since the String class has a built-in compareTo method, we use that
        // of course any custom implementation has to made explicitly here.
    }

    @Override
    public String toString() {
        return name; // here we are overloading string method so it does not return object address in memory rather we want it to
        // print out the name field.
    }

    public String getEmail() { // make this method for retrieving the name field outside the class
        return email;
    }

}
