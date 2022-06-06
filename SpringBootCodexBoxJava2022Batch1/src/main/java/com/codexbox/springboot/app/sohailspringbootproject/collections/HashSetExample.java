package com.codexbox.springboot.app.sohailspringbootproject.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class HashSetExample {

    @Test
    public void hashSetMethod(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Sohail");
        list.add("Mounika");
        list.add("Junaid");
        list.add("Sohail");
        System.out.println("My Array List is : " +list);

//        Set doesnt maintain the Insertion Order
        HashSet hashSet = new HashSet(list);
        System.out.println("My HashSet List is : " +hashSet);
//        Now to find the Particular data Example Junaid
//        Use Linked HashSet to maintain the Insertion order and Arraylist to get the particular data.
//          because getmethod is available only in List Interface
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
    }
}
