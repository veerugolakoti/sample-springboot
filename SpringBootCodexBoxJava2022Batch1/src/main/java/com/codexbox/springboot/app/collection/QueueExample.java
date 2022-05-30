package com.codexbox.springboot.app.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
     PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("sasi");
        pq.add("sangam");
        pq.add("pajero");

        System.out.println("enter the names : " + pq);

       pq.remove("sangam");
       System.out.println("after remove the names : "+ pq);
    }

}

