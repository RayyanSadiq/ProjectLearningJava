package com.Droid7X.OOP.Inheritance_And_Polymorphism.Part1;

public class MainPoint {
    public static void main(String[] args) {
        var point1 = new PointClass(1,2);
        var point2 = new PointClass(1,2);
        System.out.println(point2.equals( point1)); // over here we are checking out our new overridden equals method
        System.out.println(point1.hashCode());
        // the hashcode affects the address too, if two hashes are the same, then the address would also be the same of those 2 objects.
        // so when we override the hashcode() function we are basing the hashcode on the contents of the class,
        System.out.println(point2); // here we are checking our overridden hashcode method.
        System.out.println(point1); // since this object has the same coordinates as the other one, they both
        // have the same hash code
    }
}
