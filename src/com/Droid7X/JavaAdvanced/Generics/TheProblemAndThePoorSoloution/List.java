package com.Droid7X.JavaAdvanced.Generics.TheProblemAndThePoorSoloution;

public class List {

    /*
    private int[] items = new int[10];

    private int count;

    public void add (int item) {
        items[count++] = item;
    }

    public int get (int index) {
        return items[index];
    }
     */

    // now the problem with the code above is that this list only works for integers, if we want to make one for
    // a user object or other data types, it would be a lot of code duplications. Now lets look at the poor solution

    private Object[] items = new Object[10];
    private int count;

    public void add (Object item) {
        items[count++] = item;
    }

    public Object get (int index) {
        return items[index];
    }

    // while the implementation above does work, this gives rise to two new errors as you will see in the "Main" file
    // of this directory.
}
