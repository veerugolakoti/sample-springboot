package com.codexbox.springboot.app.ramdurgaprasad.collections;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> count2 = new TreeSet<>();
        count2.add("r");
        count2.add("g");
        count2.add("hj");
        count2.add("d");
        count2.add("ad");
        count2.add("rs");
        count2.add("aa");
        count2.add("Sa");
        count2.add("aF");
        count2.add("uiy");
        Iterator<String> sfd= count2.descendingIterator();
   while(sfd.hasNext()){
       System.out.println(sfd.next());
   }
        System.out.println(count2);
        Iterator<String> ty = count2.iterator();
        while(ty.hasNext()){
            System.out.println(ty.next());
        }
        List<Integer> count =new java.util.ArrayList<>();
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(4);
        count.add(5);
        count.add(6);
        count.add(7);
        count.add(8);

//        count.addAll(count2);
        System.out.println(count);
    }
}