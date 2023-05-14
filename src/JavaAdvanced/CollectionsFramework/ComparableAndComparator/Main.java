package JavaAdvanced.CollectionsFramework.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // In this directory we will review what is the comparable interface is and learn what the comparator interface is
        List<Customer> list = new ArrayList<>(); // making a new list of Customer.

        list.add(new Customer("j ", "gmail"));
        list.add(new Customer("g ", "yahoo"));
        list.add(new Customer("m ", "business"));

        Collections.sort(list); // here is the list sorted with the comparable interface we made inside the customer class
        System.out.println(list);
        Collections.sort(list,new EmailComparator()); // here we are passing a comparator which gives a different criteria
        // to sort by, check EmailComparator for more information.
        System.out.println(list);
    }
}
