package com.codexbox.springboot.app.ramdurgaprasad;

import java.util.*;

public class DuplicateWordsWithCount {
    public  void testSetOperations() {

        List<String> arrayList	= new ArrayList<>();

        arrayList.add("ram");
        arrayList.add("ganesh");
        arrayList.add("rahena");
        arrayList.add("ram");
        arrayList.add("bhargav");
        arrayList.add("rahena");
        arrayList.add("ganesh");
        arrayList.add("bhargav");
        arrayList.add("ram");
        System.out.println(arrayList);
//        System.out.println("Values from my Set: " + hashSet);
        HashSet<String> hashSet	= new LinkedHashSet<>(arrayList);
        for (String name :hashSet) {
            System.out.println(name+"Name is : " + Collections.frequency(arrayList,name));
        }
       /* System.out.println("The value at inded 0 from my set is : " + hashSet.iterator().next());
        System.out.println("The value at inded 1 from my set is : " + hashSet.iterator().next());*/







  /*      System.out.println("Values from my list: " + arrayList);

        System.out.println("The value at inded 1 is : " + arrayList.get(1));*/


    }
}
