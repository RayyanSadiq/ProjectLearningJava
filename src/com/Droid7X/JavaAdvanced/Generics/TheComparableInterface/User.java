package com.Droid7X.JavaAdvanced.Generics.TheComparableInterface;

public class User implements Comparable<User> { // The comparable Interface, a very important interface to learn as it allows
    // you to compare to objects together based on a criteria you choose for it. You can put all this detail in the method
    // this interface provides which is the compareTo method.

    // One main crucial use of the Comparable Interface is that sorting Algorithms often use the compareTo method sort out a list of
    // Objects, so if I have a list fo 4 swords and i want to sort them, i would use this interface to implement what
    // they should be sorted by.

    // Another thing to note is that this interface is a generic interface, make sure to pass a specified type, or you could
    // leave it blank, but that is detrimental as we will cover why in the compareTo method below

    // KEEP IN MIND THAT THE "compareTo" METHOD IS NOT REPLACEABLE WITH EQUALS METHOD, BOTH METHODS HAVE THEIR OWN USES
    // AND SHOULD NOT BE USED IRREPLACEABLY.

    // equals method = used for seeing if two objects are EXACTLY the same
    // compareTo method = used to see if an object is GREATER or LESSER than each other.

    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public String toString() { // this is being used in the generic methods folder
        return "Points:" + points;
    }

    @Override
    public int compareTo(User other) { // As you can that the data type of this method is of User class, this is because
        // we passed User as argument for the generic type parameter, but what happens if we remove the generic parameters
        // completely, it will make the data type of other is an Object class and this is not good as it brings the same
        // consequences of not using Generic types in the first place which is the chance for a data type error and we will
        // have to do manual casting again.


        // the purpose of the compareTo method is that if:
        // this.variable < other.variable, then return negative value
        // this.variable == other.variable, then return 0
        // this.variable > other.variable, then return positive value
        return points - other.points;


    }
}
