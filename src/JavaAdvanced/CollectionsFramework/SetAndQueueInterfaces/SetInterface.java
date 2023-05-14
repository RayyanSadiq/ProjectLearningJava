package JavaAdvanced.CollectionsFramework.SetAndQueueInterfaces;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        // sets are used to make a list of items that are unique and without duplicates.
        Set<String> set1 = new HashSet<>(); // syntax for HashSet which is the most common use of the set1 interface
        set1.add("we");
        set1.add("are");
        set1.add("cool");
        set1.add("cool");
        System.out.println(set1); // one thing to note is that when we print this out, it does not print out the
        // data we added in order, this is characteristic to understand about sets, when using them, they do not,
        // guarantee order, just data uniqueness, so keep that in mind when ,moving forward.

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "we","green","are");
        Set<String> set2 = new HashSet<>(collection);
        System.out.println(set2);



        // Now lets go into the different set1 operations that deal with how sets intractable ith each other

        // Union
        set1.addAll(set2); // what this does is combines both sets and keep all unique values and remove any duplicates
        System.out.println(set1);
        // one unique thing about this method is that since its wildcard extends, its CAP class becomes
        // a child of the Collection Interface, this means it is the parent of the Queue, List, and Set Interfaces.
        // This means we can pass a list, queue, or a set into this method, not for the others since their wildcard does \
        // not extend.


        // Intersection
        Set<String> set3 = new HashSet<>();
        Collections.addAll(set3, "we", "nice","green");
        Set<String> set4 = new HashSet<>();
        Collections.addAll(set4, "cool", "nice","we");

        set3.retainAll(set4); // what this does is keep items that are common between sets
        System.out.println(set3);

        // Difference
        Set<String> set5 = new HashSet<>();
        Collections.addAll(set5, "we", "nice","green");
        Set<String> set6 = new HashSet<>();
        Collections.addAll(set6, "cool", "nice","we");

        set5.removeAll(set6);
        System.out.println(set5); // so if you want to know what items we have in the first set that are not in the second set
        // we use removeAll.






    }
}
