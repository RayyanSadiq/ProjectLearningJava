package com.LearningProject.JavaAdvanced.CollectionsFramework.CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
    // If you want to use a collection of objects, but you care about the index of those elements or objects, then use
    // The ArrayList which is the class that implements the List interface. is used to make a collection that acts like
    // a dynamic list of objects.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // syntax for creating a new Arraylist
        list.add("O"); // the normal add method from the Collection interface
        Collections.addAll(list, "2","e","q","2","2"); // we can use the collections method on arraylist because it is a descendant of
        // collection Class, and because every list is a collection we can use it in here.
        System.out.println(list+"\n");

        list.add(1,"3"); // this add method is unique to the ArrayList as it is overloaded form of the original
        // add method from the collection class that took only an object as an argument.
        // Now it can take an index at the first argument to insert the new value somewhere. The
        // normal Collection class does not have this, this is only in the Arraylist class.


        list.remove(2); // the same is for the remove method, you can specify a given index to remove a value at that index
        System.out.println(list+"\n");

        list.set(2,"qw"); // this method is used to replace a value at a given index with another value
        String x = list.set(3,"ws"); // this method can also return the replaced value in case for later use
        System.out.println(list+"\n");
        System.out.println(x);

        int y = list.indexOf("ws"); // this method gets the index of a given value, if not in the list, returns -1.
        System.out.println(y);

        int z = list.lastIndexOf("ws"); // This method is another useful list method as finds the last occurrence of an element,
        // and returns the index of the last occurrence of the items.
        System.out.println(z);

        var s  = list.subList(0,3); // this sublist method take in a start index and end index, and returns a new list
        // with that new range of values.
        System.out.println(s);

    }
}
