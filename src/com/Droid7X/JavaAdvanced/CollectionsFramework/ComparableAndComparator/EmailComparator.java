package com.Droid7X.JavaAdvanced.CollectionsFramework.ComparableAndComparator;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> { // this is the comparator interface. The comparator interface
    // is used if you want to sort by different criteria. For example if i sort weapons in a game, the default implementation may be
    // by highest to the lowest damage. However, lets say I want to sort my weapon by name, or critical hit chance, etc. This is where
    // comparators come in, to  give a different criteria to sort by.
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
