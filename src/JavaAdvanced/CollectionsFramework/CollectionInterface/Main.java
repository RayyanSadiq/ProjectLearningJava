package JavaAdvanced.CollectionsFramework.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("k");
        list.add("l");
        Collections.addAll(list, "2","2");
        System.out.println(list.contains("2"));
        list.clear();
        list.add("1");
        Object [] array = list.toArray();
        String [] array2 = list.toArray(new String[0]);

    }
}
