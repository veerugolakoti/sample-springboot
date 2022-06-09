package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.collections.StudentExample;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RavaliTest {

    @Test
    public void mystack() {
    }

    @Test
    public void myqueue() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("cat");
        queue.add("rat");
        queue.add("dog");
        queue.add("fox");
        queue.add("rabbit");
        queue.add("ant");


        for (String S : queue) {
            System.out.println(queue);

        }
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.offer("frgreg"));
        System.out.println(queue.size());
        System.out.println(queue.contains(hashCode()));


    }

    @Test
    public void myhashset() {

        Set<Integer> numbers = new HashSet<>();


        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(20);
        numbers.add(1);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(numbers.equals(numbers));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        Iterator<Integer> i = numbers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            // System.out.println(i.hasNext());
            // System.out.println(numbers);
        }


    }

    @Test
    public void myLinkedhashset() {

        Set<String> names = new LinkedHashSet<>();
        names.add("renu");
        names.add("sana");
        names.add("sony");
        names.add("sony");

        System.out.println(names);

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("rema");
        names1.add("renu");
        names1.add("sana");
        names1.add("sony");
        names1.add("sony");
        names1.add("ameeth");
        names1.add("kowmik");
        System.out.println("before sorting names:" + names1);

        TreeSet<String> NAME = new TreeSet<>(names1);
        System.out.println("after sorting  names order:" + NAME);
        System.out.println(NAME.descendingIterator());
        System.out.println(NAME.size());
        // System.out.println(NAME.clone());
        System.out.println(NAME.headSet("e"));
        System.out.println(NAME.pollFirst());

    }

    @Test
    public void hashmap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("abc", 4);
        map.put("cde", 5);
        map.put("cde", 5);
        map.put("rst", 89);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.get("abc"));
        System.out.println(map.keySet());
        System.out.println(map.replace("abc", 67));

        StudentExample studentExample = new StudentExample("swathi", 5, "hyd");
        StudentExample studentExample1 = new StudentExample("swetha", 9, "hyd");
        StudentExample studentExample2 = new StudentExample("swetha", 9, "hyd");

        Map<String, StudentExample> stdmap = new HashMap<>();
        stdmap.put("studentExample", studentExample);
        stdmap.put("studentExample1", studentExample1);
        stdmap.put("studentExample2", studentExample2);

        // System.out.println("my student:" + stdmap);

        for (Map.Entry<String, StudentExample> entry : stdmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName() + " " + entry.getValue().getAddress() + " " + entry.getValue().getId());


        }


/*
        Stack<Integer>stack=new Stack<>();
        //push means adding
        stack.push(8);
        stack.push(3);
        stack.push(1);
        stack.push(2);

        System.out.println(stack);
        System.out.println(stack.pop()); //pop means it last  element remove
        System.out.println(stack.contains(8));
        System.out.println(stack.add(4)); //and  add this element
        System.out.println(stack);
        System.out.println(stack.remove(2));*/
    }
}