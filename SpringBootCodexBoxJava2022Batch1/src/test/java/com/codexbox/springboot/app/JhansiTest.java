package com.codexbox.springboot.app;

import com.codexbox.springboot.app.jhansiproject.assesment.EmployeeDetails;
import org.junit.jupiter.api.Test;

import java.util.*;

public class JhansiTest {


    private String[] hashSet;

    @Test
    void contextLoads() {
        HashSet<Integer> hash = new HashSet<>();
        int[] a = {3, 4, 5, 3, 6, 4};
        for (int i = 0; i < a.length; i++) {
            if (hash.add(a[i]) == false) {
                System.out.println(a[i] + "duplicated in the array");
            }
        }
        {
        }
    }

    @Test
    void priorityqueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(58);
        queue.add(96);
        System.out.println("printing the elements" + queue);
        System.out.println(queue.peek());
        queue.remove(96);
        System.out.println(" After remove " + queue);

    }

    @Test
    public void treeset() {
        NavigableSet<String> ts = new TreeSet<>();

        ts.add("india");
        ts.add("america");
        ts.add("london");

        System.out.println("adding elements:" + ts);
        System.out.println("treeset is" + ts);
        String check = "india";
        System.out.println("contains " + check + " " + ts.contains(check));
        System.out.println("last value " + ts.last());
        System.out.println("first value " + ts.first());
        String st1 = "india";


    }

    @Test
    public void linked() {
        LinkedHashMap<String,Integer> linked=new LinkedHashMap<>();
        linked.put("jhansi",21);
        linked.put("sony",96);
        linked.put("venkat",45);
        linked.put("vani",67);
        linked.put("mouni",76);
        System.out.println("adding the linkedmap:"+linked);

        for (Map.Entry<String,Integer> hnp :linked.entrySet()) {
          String key=hnp.getKey();
          Integer value=hnp.getValue();
            System.out.println(key+" :"+ value);

        }
    }
    @Test

    public void employee(){
        EmployeeDetails emp1=new EmployeeDetails("name",1,"hyderabad");
        EmployeeDetails emp2=new EmployeeDetails("name1",2,"bangcock");
        EmployeeDetails emp3=new EmployeeDetails("name2",3,"salad");
        EmployeeDetails emp4=new EmployeeDetails("name3",4,"horlicks");


        Map<Integer,EmployeeDetails> emplist=new HashMap<>();
        emplist.put(1,emp1);
        emplist.put(2,emp2);
        emplist.put(3,emp3);
        emplist.put(4,emp4);



        for (Map.Entry<Integer,EmployeeDetails> std :emplist.entrySet()) {
            System.out.println(std.getKey()+" "+std.getValue().getId()+" "+std.getValue().getName()+" "+std.getValue().getAddress());
        }

    }


}




















