package com.codexbox.springboot.app.renuProjects.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleOfQueue {
  public void QueueMethod(){
      PriorityQueue<Integer> qint=new PriorityQueue<>();
      qint.add(10);
      qint.add(20);
      qint.add(30);
      qint.add(40);
      qint.add(50);
      qint.add(20);
      System.out.println(qint);
      System.out.println(qint.peek());
      //System.out.println(qint.remove(20));
      LinkedList<Integer> numbers=new LinkedList<>(qint);
      System.out.println(numbers);




 }
}
