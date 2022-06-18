package com.codexbox.springboot.app.rehana.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExample {
   public void  operations(){
       PriorityQueue<String> myqueue = new PriorityQueue<>();
       myqueue.offer("abc");
       myqueue.offer("efg");
       myqueue.offer("hij");
       myqueue.offer("klm");
       myqueue.offer("hlk");
       System.out.println( myqueue.peek());
       System.out.println( myqueue.poll());
       System.out.println(myqueue.poll());
       System.out.println( myqueue.size());
       System.out.println( myqueue.contains("rehana"));
        myqueue.clear();
       System.out.println(myqueue);


       System.out.println(myqueue);


    }
}
