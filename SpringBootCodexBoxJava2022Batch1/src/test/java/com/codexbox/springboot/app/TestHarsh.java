package com.codexbox.springboot.app;

import com.codexbox.springboot.app.HarshaDeepthi.EmployeeDetails;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestHarsh {
    @Test
    public void setOperations() {
        ArrayList<String> setone = new ArrayList<>();
        setone.add("Harsha");
        setone.add("Harsha");
        setone.add("Ramesh");
        setone.add("Ranjan");
        setone.add("Renuka");
        setone.add("Jansi");
        setone.add("Renuka");
        System.out.println(setone.size());
        HashSet<String> hashSet = new HashSet<String>();
        // System.out.println(hashSet);
        for (int i = 0; i < setone.size(); i++) {
            if (hashSet.add(setone.get(i)) == false) {
                System.out.println(setone.get(i));
            }
        }
    }

    @Test
    public void setOperation() {
        HashSet<String> hashset = new HashSet<>();
        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("D");
        hashset.add("E");
        hashset.add("F");
        System.out.println("my set is:" + hashset);
        System.out.println("my set size is:" + hashset.size());
        System.out.println("element is: " + hashset.iterator().next());
        System.out.println("set is:" + hashset);
    }

    @Test
    public void pqueueOperation() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(24);
        priorityQueue.add(34);
        priorityQueue.add(44);
        priorityQueue.add(54);
        System.out.println("Priorityqueue is: " + priorityQueue);
        System.out.println("using offer operation is: " + priorityQueue.offer(43));
        System.out.println("using peek operation is: " + priorityQueue.peek());//first element come
        System.out.println("using poll operation is: " + priorityQueue.poll());
        System.out.println("After poll:" + priorityQueue);
        System.out.println("Remove number is 44: " + priorityQueue.remove(44));
        System.out.println("after removing 44 is: " + priorityQueue);
        System.out.println("operation is 1:" + priorityQueue.iterator().next());
        System.out.println("operation is:" + priorityQueue.iterator().next());
        System.out.println("hasnext operation is:" + priorityQueue.iterator().hasNext());
        System.out.println("operation is:" + priorityQueue.iterator().hasNext());

        priorityQueue.clear();
        System.out.println("operation is:" + priorityQueue.iterator().hasNext());

        System.out.println(priorityQueue);

    }

    @Test
    public void mapOperations() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Harsha", 1);
        map.put("Saikeerthi", 2);
        map.put("Ranjan", 3);
        map.put("Ramesh", 4);
        map.put("Sasi", 5);
        map.put("Harsha", 6);
        System.out.println("ranjan Id is:" + map.get("Ranjan"));
        System.out.println(" initial map Names and Id are: " + map);
        map.put("Ramesh", 10);
        System.out.println("updated map names and Id are:" + map);
    }

    @Test
    public void queueOperation() {
        Queue<String> que = new LinkedList<>();

        que.add("Mango");
        que.add("Apple");
        que.add("Banana");
        que.add("Watermelon");
        que.add("pineApple");
        System.out.println("All fruits are:" + que);
        System.out.println("size is:" + que.size());
        System.out.println("Removed Mango:" + que.remove("Mango"));
        System.out.println("After remove :" + que);
        System.out.println("Watermelon includes in this Queue: " + que.contains("Watermelon"));
        que.clear();
        System.out.println(" queue after using clear: " + que);
    }

    @Test
    public void testMapOperations() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Deepthi", 15);
        mp.put("Harsha", 20);
        mp.put("Ramesh", 30);
        mp.put("Swath", 40);
        mp.put("Renuka", 50);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Keerthi");
        map.put(2, "Nagarjuna");
        map.put(3, "Jansi");
        map.put(4, "junaid");
        map.put(58, "Kalyan");

        EmployeeDetails employee1 = new EmployeeDetails(202212, "Bhargav", "Hyd");
        EmployeeDetails employee2 = new EmployeeDetails(202213, "Ganesh", "karnool");
        EmployeeDetails employee3  = new EmployeeDetails(202214, "Teja", "Kadapa");


        Map<String, EmployeeDetails> empmap = new HashMap<>();
        empmap.put("employee1", employee1);
        empmap.put("employee2", employee2);
        empmap.put("employee3", employee3);

        System.out.println("My employee map : " + empmap);
        Collection<EmployeeDetails> employeeCollection = empmap.values();
        for (EmployeeDetails emp : employeeCollection) {
            System.out.println("Employee name is:" + emp.getEmployeeName());
        }
        EmployeeDetails emp = empmap.get("employee1");
        System.out.println("employee 1 name is:" + emp.getEmployeeName());

        System.out.println("map is:" + map);
        System.out.println("keerthi value is" + map.get("Keerthi"));
        Set<String> keyset = mp.keySet();
        System.out.println("Keerthi value is:" + map.get(1));
        Set<String> keyset1 = mp.keySet();
        System.out.println("all keys:" + keyset);
        System.out.println("all values:" + map.values());
        for (Map.Entry<String, EmployeeDetails> entry : empmap.entrySet()) {
            System.out.println("My key: " + entry.getKey() + " My Value " + entry.getValue().getName());

        }
    }
}
