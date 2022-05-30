package com.codexbox.springboot.app.abhilash.collection;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
@Component
public class SetExample {
    public void methodOnSet() {
        Set<String> hashset = new HashSet<>();
        hashset.add("abhilash");
        hashset.add("shiva");
        hashset.add("junaid");
        hashset.add("shiva");
        hashset.add("vidya");
        hashset.add("vidya");
        System.out.println(hashset);
        ArrayList<String> arrayList = new ArrayList(hashset);
        System.out.println(arrayList);
    }
}
