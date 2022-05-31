package com.codexbox.springboot.app;

import ch.qos.logback.core.BasicStatusManager;
import org.junit.jupiter.api.Test;

import java.util.*;

public class JhansiTest {


    private String[] hashSet;

    @Test
    void contextLoads() {
        HashSet<Integer> hash = new HashSet<>();
        int[] a={3,4,5,3,6,4};
        for (int i=0;i<a.length;i++){
            if (hash.add(a[i])==false){
                System.out.println(a[i]+"duplicated in the array");
            }}
        {
        }}

    @Test
    void priorityqueue() {
       PriorityQueue<Integer> queue=new PriorityQueue<>();
       queue.add(12);
       queue.add(58);
       queue.add(96);
        System.out.println("printing the elements" +queue);
        System.out.println(queue.peek());
        queue.remove(96);
        System.out.println(" After remove "+queue);

    }
    @Test
    public void treeset(){
        NavigableSet<String> ts=new TreeSet<>();

        ts.add("india");
        ts.add("america");
        ts.add("london");

        System.out.println("adding elements:"+ts);
        System.out.println("treeset is"+ts);
        String check="india";
        System.out.println("contains "+check+" "+ ts.contains(check));
        System.out.println("last value "+ts.last());
        System.out.println("first value "+ts.first());
        String st1="india";


    }
    }



















