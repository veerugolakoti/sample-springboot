package com.codexbox.springboot.app.renuProjects.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleOfQueue {
  public void QueueMethod(){
      Queue<Integer> qint=new PriorityQueue<>();
      for(int i=1; i<10; i++){
          System.out.println(i);
          System.out.println(qint.offer(i));
      }

      System.out.println(qint.peek().equals(2));
 }
}
