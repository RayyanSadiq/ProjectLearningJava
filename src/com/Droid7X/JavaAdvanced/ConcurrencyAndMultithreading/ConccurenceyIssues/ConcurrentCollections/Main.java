package com.Droid7X.JavaAdvanced.ConcurrencyAndMultithreading.ConccurenceyIssues.ConcurrentCollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.get(1);
        map.remove(1);
    }
}
