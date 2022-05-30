package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class VasuTest {/*
    @Test
    *//*public void testPriorityQueue(){
        PriorityQueue queue=new PriorityQueue();
        queue.add("name1");
        queue.add("name2");
        queue.add("name3");
        queue.add("name4");
        System.out.println("queue size:"+queue.size());
        System.out.println("queue poll:"+queue.poll());
        System.out.println("queue peek:"+queue.peek());
        System.out.println("queue remove:"+queue.remove());
        try {
            System.out.println("queue toArray:" + queue.toArray());
        }
        catch (Exception e){
            System.out.println("got exception while converting queue to array");
        }

    }*/
    @Test
            public void testOperators() {
        //hash set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("vaasu");
        hashSet.add("vaasu1");
        hashSet.add("vaasu2");        // hash set will not allowed dulicates..
        hashSet.add("vaasu3");
        hashSet.add("vaasu");
        System.out.println("Hash set:"+hashSet);

        for (String str:hashSet) {
            System.out.println("str:"+str);
        }
        System.out.println("The value of inded 0 from my set is:"+hashSet.iterator().next());
        System.out.println("The value of inded 0 from my set is:"+hashSet.iterator().next());


        // arraylist
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("vaasu");
        arrayList.add("vaasu1");
        arrayList.add("vaasu2");      // list allowes duplicates
        arrayList.add("vaasu3");
        arrayList.add("vaasu1");
        System.out.println("Arraylist:"+arrayList);

        // list-arraylist

        List<String>arraylist1=new ArrayList<>();
        arraylist1.add("vasu");
        arraylist1.add("vasu1");
        arraylist1.add("vasu2");      // list allowes duplicates
        arraylist1.add("vasu3");
        arraylist1.add("vasu1");
        System.out.println("Arraylist:"+arrayList);


    }
}
