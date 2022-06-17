package com.codexbox.springboot.app.abhilash.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetArrayExample {
    public void setArray() {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,1,0,6}));
        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[]{3,45,2,3,42,15,42,52,0}));

        Set<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println("union is: " + union);

        Set<Integer> interjection = new HashSet<>(set);
        interjection.retainAll(set2);
        System.out.println("RetainAll result is : " + interjection);

        Set<Integer> differ = new HashSet<>(set2);
        differ.removeAll(set);
        System.out.println("different elements is: " + differ);

        Set<Integer> ex = new HashSet<>(set2);
        ex.clear();
        System.out.println("clear result is : " + ex);
        Set<String> adding = new LinkedHashSet<>();
        adding.add("forget");
        adding.add("the");
        adding.add("mistake");
        adding.add("remember");
        adding.add("the");
        adding.add("lesson");
        System.out.println("elements of the set is: " +adding);
        System.out.println("contains " + adding.contains("mistake"));
        System.out.println("contains " + adding.containsAll(adding));

    }
}
