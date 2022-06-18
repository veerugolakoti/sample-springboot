package com.codexbox.springboot.app.sohailspringbootproject.collections;

import org.junit.Test;

import java.util.*;

public class DescendingOrder {
    Integer  [] a= {5,4,7,9,10,0};

    @Test
    public void  descendingMethod(){

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(12);
        treeSet.add(17);
        treeSet.add(0);
        treeSet.add(4);
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

        List list = Arrays.asList(a);
        System.out.println(list);
        list. set(0,24);
        System.out.println(list);

        }
    }

