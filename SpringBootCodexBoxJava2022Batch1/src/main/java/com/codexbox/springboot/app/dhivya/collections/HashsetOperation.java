package com.codexbox.springboot.app.dhivya.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetOperation {
    public void hashsetExample(){
        HashSet<String>hashSet=new LinkedHashSet<>();
        hashSet.add("divya");
        hashSet.add("mounika");
        hashSet.add("divya");
        hashSet.add("dinesh");
        hashSet.add("sohail");
        hashSet.add("vamshi");
        System.out.println("duplicate value from my list : " +hashSet);

    }
}
