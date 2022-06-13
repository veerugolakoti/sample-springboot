package com.codexbox.springboot.app.codexbox.BhargavTej.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
   public Set addHashSet(){
       Set<String> hash = new HashSet<String>();
       {
            hash.add("CodexBox");
            hash.add("Wipro");
            hash.add("Kagool");
            hash.add("TCS");
            hash.add("Wipro");
           System.out.println(hash);
           hash.remove("Kagool");
           System.out.println(hash);
       }
       return hash;
    }
    public void linkedhashset() {
        Set<String> hash1 = new LinkedHashSet<>();
        hash1.add("CodexBox");
        hash1.add("Wipro");
        hash1.add("Kagool");
        hash1.add("TCS");
        hash1.add("Wipro");
        hash1.add("TCS");
        hash1.add("Infosis");
        System.out.println(hash1);
    }

    public void treeseExamples(){
        TreeSet<Integer> treeSet = new TreeSet();//without polymorphisam.
        treeSet.add(200);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(500);
        treeSet.add(2000);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(500);
        //Treeset eleminates duplicates value and print elements in sorting order.
        System.out.println("After sorting : " + treeSet);
        System.out.println("Descending Order " + treeSet.descendingSet());//descending order.
    }
}
