package feature_ranjan.collection;

import java.util.PriorityQueue;

public class Queue {
    public void queue(){
       PriorityQueue<String> queueEx = new PriorityQueue<>();
       queueEx.offer("zin");
       queueEx.offer("risi");
       queueEx.offer("exi");
       queueEx.offer("sonic");
       queueEx.offer("apple");
       System.out.println(queueEx);
        System.out.println(queueEx.peek());
        System.out.println(queueEx.contains("sonic"));
        System.out.println(queueEx.poll());
    }
}
