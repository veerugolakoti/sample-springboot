package com.codexbox.springboot.app.ravalispringboot.collections;

import java.util.HashSet;
import java.util.Set;

public class SetHashsetExample {

    Set<Integer>numbers=new HashSet<>();

    public void myhashset(){
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);

        System.out.println(numbers);
    }
}
