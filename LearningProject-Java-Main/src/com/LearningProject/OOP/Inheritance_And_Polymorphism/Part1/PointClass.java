package com.LearningProject.OOP.Inheritance_And_Polymorphism.Part1;

import java.util.Objects;

public class PointClass {

    private int x;
    private int y;

    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) { // here we are overriding the equals method that is inherited from the
        //built-in object class since it only compares the addresses of two objects, we want to see if the coordinate
        // points are the same and return a boolean based on that, to do that we must override the equals method
        // for this class

        // Tip: don't change the parameters of a method when overriding a method otherwise the "signature" will be ruined
        // and the override will cause an error.

        if (this == obj) { // checks to see if the object in the argument is itself, if so returns true
            return true;
        }

        if (!(obj instanceof PointClass)) { // checks if object is not another point object, since we are trying to
            // compare two values that are only in other point objects, other class will not have the same fields.
            return false;
        }

        var other_point = (PointClass) obj; // compares this objects points with the other given object's points to see
        // if they are the same coordinate.
        return other_point.x == x && other_point.y == y;
    }

    @Override // It is a must and absolutely necessary to change the hashcode() method whenever changing the equals()
    // method. You must override hashCode() in every class that overrides equals(). Failure to do so will result in a
    // violation of the general contract for Object.hashCode(), which will prevent your class from functioning properly
    // in conjunction with all hash-based collections, including HashMap, HashSet, and Hashtable.
    public int hashCode() {
        return Objects.hash(x,y); // when overriding hashCode we want to generate a hashcode based on the contents of
        // these objects, which are x and y.

        // We do this by calling the "Objects" class, which is a class in the java.util package, and use a method it has
        // called hash. This method generates a hash value, which takes in values and maps them to a hash value. We put
        // in our class contents which are its fields, in here, and then we are done, that's how we properly override
        // the hash value.

        // In theory a hash value uniquely identifies objects, it works 99% of the time.
        // we can automatically do all of this in intellej through the shortcut ctrl + insert
    }

}
