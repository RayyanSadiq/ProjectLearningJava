package com.Droid7X.JavaAdvanced.CollectionsFramework.CollectionInterface;

import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        // The collection interface is a interface that extends the Iterable interface and inherits all of its properties.
        // This interface adds all features that a collection should have such as add, remove, contains, addAll, etc.
        // Here are some useful methods provided by this method below.

        Collection<String> list = new ArrayList<>(); // Here we are creating a collections object that is intiallized to
        // a ArrayList but is upcasted to a Collection object.
        list.add("k"); // adds to a collection
        list.add("l");

        Collections.addAll(list, "2","2"); // adds multiple elements in a single go.
        System.out.println(list.contains("2")); // checks if given value exists.

        list.clear(); // make collection empty
        list.add("1");

        Object [] array = list.toArray(); // If i want to extract a collection object to a array I use toArray() method
        // however using this alone would mean it is only store-able in an object of type Object class.
        String [] array2 = list.toArray(new String[0]); // To change this we make a new array inside the toArray method
        // and give it 0, it does not matter if we pass 0 because it will automatically resize to fit the content of the
        // collections we are trying to convert.

        List<String> list2 = new ArrayList<>();
        list2.addAll(list); // here we can also use 



    }
}
