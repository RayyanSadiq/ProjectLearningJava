package com.Droid7X.JavaAdvanced.CollectionsFramework;

import com.Droid7X.JavaAdvanced.CollectionsFramework.ComparableAndComparator.Customer;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        // this section covers hashmaps which are not a part of the Collections framework, it is entirely separate.
        // Hashmaps ares something used in java that map a key to a value. What this means is that a key is given
        // and the hashmap will return a value associated with that value. It does this in a space complexity of O(1).
        // Learn the "big O notation" in the algorithms and data structure course. O(1) means a algorithms is very efficient.

        var customer1 = new Customer("moonsta", "kulu-ya-ku"); // here we are creating two new objects
        var customer2 = new Customer("egg","chicken"); // to put into our map

        Map<String, Customer> map = new HashMap<>(); // syntax for hashmaps
        map.put(customer1.getEmail(),customer1); // the put() method is how we put in values in our map. so what
        // we are doing here is making the key value be the customers email, and then value assigned to that key is the
        // customer itself with that email.
        map.put(customer2.getEmail(),customer2);


        var customer = map.get("kulu-ya-ku"); // now we can get a customer my calling by their associated emails
        System.out.println(customer);

        var unknown = new Customer("jacket", "chad");
        System.out.println(map.getOrDefault("e3",unknown)); // The get method is useful as it gets a value at a key,
        // but if the given key is not in the list will return null. To avoid returning null we use this getOrDefault()
        // method to give in a default value to return if a given key does not exist instead of a null value.

        System.out.println(map.containsKey("e1")); // checks if a key value exists, returns a boolean.

        map.replace("chicken",new Customer("meat","chicken")); // The replace method replaces the value at a
        // given key. It also returns the value being replaced.
        System.out.println(map);
        System.out.println("\n");

        // let's say we want to iterate over our hashmap, the thing is we can't since hashmaps are not iterable, however
        // there are a number of HashMap methods that can help us with this.

        // keySet - this returns a set of keys in a hashmap, and since Sets are iterable, we can iterate over this.
        // However, keep in mind this is a set and order of values is not guaranteed, this applies for all of these.
        for ( var key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("\n");


        // entrySet - returns an entire entry from the HashMap in a Set.
        for ( var entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // values - returns all the values themselves and not the keys, in HashMaps. Order is not guaranteed
        for ( var customers : map.values()){
            System.out.println(customers);
        }

    }
}
