package com.codexbox.springboot.app;

import com.codexbox.junaidspringboot.app.springboot.StackExamples;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestMohammed
{
    @Test
   public void stackExampleMethod(){
        StackExamples stackExamples = new StackExamples();
        stackExamples.getNormalStackValues();
    }


    @Test
    public void queueExampleMethod()
    {
        Queue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.offer(234.90);
        doubleQueue.offer(8484.9449);
        doubleQueue.offer(3893.23020);
        doubleQueue.offer(093.489);

        System.out.println("My Queue List is contains double values:" + doubleQueue);

    //    doubleQueue.remove(8484.9449);

        System.out.println("After deleting my Queue List is: " + doubleQueue);

    }

    @Test
    public void priorityQueueExample()
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 4; i++) {
            priorityQueue.add(i);
            priorityQueue.add(1);
        }
        System.out.println(priorityQueue);
    }

    @Test
    public void dQueueExamples()
    {
        Deque<Integer> integerDeque = new LinkedList<>();
        integerDeque.offer(898);
        integerDeque.offer(98858);
        integerDeque.offer(89038);
        integerDeque.offer(908);
        integerDeque.offer(848);
        integerDeque.offer(933);
       Iterator<Integer> iteratorValues =  integerDeque.iterator();
        System.out.println("The Iterators values are: ");
        while (iteratorValues.hasNext()){
        System.out.println(iteratorValues.next());
            System.out.println(integerDeque);
    }
      //  integerDeque.
      //  System.out.println(integerDeque.isEmpty());

      //  System.out.println(integerDeque.descendingIterator().next());

    }
    @Test
    public void getHashMap()
    {
        HashMap<String, Integer> floatHashMap = new LinkedHashMap<>();
        floatHashMap.put("Junaid",789);
        floatHashMap.put("Khaisar",76);
        floatHashMap.put("Qhasim",54);
        floatHashMap.put("Sohail",67);
        System.out.println(floatHashMap.entrySet());
    }
    @Test
    public void getSetInterfaces()
    {

        Set<Integer> stringSet = new LinkedHashSet<>();
        int count[] = {23,34,56,78,90,78,12};

        try
        {
            for (int i = 0; i < 7; i++)
            {
                stringSet.add(count[i]);
            }
            System.out.println(stringSet);

            TreeSet<Integer> treeSet = new TreeSet<Integer>(stringSet);

            System.out.println( "The Sorted Elements are: ");
            System.out.println(treeSet);
        }
        catch (Exception exception)
        {
            System.out.println("Add Proper Values");
        }
    }
}

