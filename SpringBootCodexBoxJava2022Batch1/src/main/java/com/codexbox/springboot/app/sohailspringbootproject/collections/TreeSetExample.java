package com.codexbox.springboot.app.sohailspringbootproject.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    @Test
    public void treeSetMethod(){
        HashMap<String , Integer> hashMap = new HashMap<>();
        hashMap.put("String" ,12);
        System.out.println(hashMap.get("String"));
        hashMap.putIfAbsent("String",12);
        hashMap.putIfAbsent("Mahesh",42);
        System.out.println(hashMap);











        Set<String> treeSet = new TreeSet<>();
// TreeSet Provides in Natural sortingorder:
        treeSet.add("Sohail");
        treeSet.add("Mounika");
        treeSet.add("Divya");
        treeSet.add("Juniad");
        treeSet.add("Vamsi");
        treeSet.add("Sohail");
        treeSet.add("Abhilash");

        System.out.println(treeSet.contains("Divya"));
        System.out.println(treeSet.remove("Vamsi"));
        System.out.println(treeSet);




        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(15);
        treeSet1.add(16);
        treeSet1.add(78);
        treeSet1.add(874);
        treeSet1.add(10);
        treeSet1.add(19);
        treeSet1.add(37);
        System.out.println(treeSet1);


    }
}
