package com.codexbox.springboot.app.sohailspringbootproject.collections;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetExample {

    @Test
    public void linkedHashSetMethod(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
// LinkedHashSet maintain only the insertion order and remove duplicates
        linkedHashSet.add("Sohail");
        linkedHashSet.add("Mounika");
        linkedHashSet.add("Divya");
        linkedHashSet.add("Junaid");
        linkedHashSet.add("Vamsi");
        linkedHashSet.add("Sohail");
        linkedHashSet.add("Abhilash");

        System.out.println("Linked HashSet List :" +linkedHashSet);
    }
}
