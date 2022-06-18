package com.codexbox.springboot.app.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {


    public void mapExamples() {
        // HashMap<String,Integer> map = new HashMap<>();
        Map<String, Integer> tree = new TreeMap<>();
        tree.put("Bokaro", 827013);
        tree.put("Gachibowli", 500068);
        tree.put("Chandanagar", 500050);
        // System.out.println(tree);
        System.out.println("As per the input " + tree);

        for ( Map.Entry<String, Integer> me : tree.entrySet()) {
            System.out.println(me);

        }
    }
}
