package com.Droid7X.JavaAdvanced.CollectionsFramework.IterableInterface;


import com.Droid7X.JavaAdvanced.CollectionsFramework.IterableInterface.GenericList;

public class Main {
    public static void main(String[] args) {

        var list = new GenericList<String>();
        list.add("b");
        list.add("r");
        list.add("a");
        list.add("h");

        var iterator = list.iterator(); // here we are making the Iterator
        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }

        for ( var item : list){
            System.out.println(item);
        }


    }
}
