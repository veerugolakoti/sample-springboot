package com.codexbox.springboot.app.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setexample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Computer");
        set.add("keyboard");
        set.add("mouse");
        set.add("keyboard");

        System.out.println("enter the values without duplicates: "+ set);
        HashSet<String> set1 = new LinkedHashSet<>();
        set1.add("Computer");
        set1.add("keyboard");
        set1.add("mouse");
        set1.add("keyboard");
        System.out.println("after enter the duplicate values :" + set1);
        set1.remove("keyboard");
        System.out.println("remove after print values : " +set1);
    }
}
