package com.codexbox.springboot.app.swathitest;

import com.codexbox.springboot.app.swathi.assesment.collections.FindingDuplicates;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
    public class TestApplication {
    @Test
    void priorityqueue() {


        PriorityQueue<Integer> variable = new PriorityQueue<Integer>();

        variable.add(10);
        variable.add(20);
        variable.add(30);
        System.out.println(variable);
        variable.remove(20);
        System.out.println("after remove:" + variable);
        System.out.println(variable.peek());
        System.out.println("poll method" + variable.poll());
        System.out.println("peek method" + variable.peek());


    }

    @Test
    public void treeset() {
        Set<String> variable = new TreeSet<>();
        variable.add("A");
        variable.add("B");
        variable.add("C");
        variable.add("C");
        System.out.println("duplicate element will not allow in set: " + variable);
        variable.remove("C");
        System.out.println("after removing element" + variable);
    }

    @Test
    public void treeset1() {
        NavigableSet<String> stringNavigableSet = new TreeSet<>();
        stringNavigableSet.add("swathi");
        stringNavigableSet.add("renuka");
        stringNavigableSet.add("jhansi");
        System.out.println(" treeset is : " + stringNavigableSet);
        String check = "swathi";
        System.out.println("Contains " + check + " " + stringNavigableSet.contains(check));
        System.out.println(" first value : " + stringNavigableSet.first());
        System.out.println(" last value : " + stringNavigableSet.last());
        String val = "renuka";
        System.out.println(" higher value " + stringNavigableSet.higher(val));
        System.out.println(" lowest value " + stringNavigableSet.lower(val));
    }

    @Test
    public void hashmap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("swathi", 10);
        map.put("jhansi", 30);
        map.put("renuka", 20);
        System.out.println(map);

        }
        }



