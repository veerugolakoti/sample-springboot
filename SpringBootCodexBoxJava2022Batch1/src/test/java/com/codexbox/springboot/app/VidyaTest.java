package com.codexbox.springboot.app;

import com.codexbox.springboot.app.collections.ExampleStack;
import org.junit.jupiter.api.Test;

import java.util.*;

public class VidyaTest {
    @Test //stack example
    public void Test() {
        ExampleStack exampleStack = new ExampleStack();
        Stack<String> str = new Stack<>();
        boolean result = str.empty();
        System.out.println("the stack is empty : " + result);
        str.push("anusha");
        str.push("ramya");
        str.push("ram");
        str.push("vv");
        result = exampleStack.Stackmethod();
        System.out.println("elements in stack :" + str);
        System.out.println("the stack is empty : " + result);
        String s = str.pop();
        System.out.println("print pop concept " + s);
        String s2 = str.peek();
        System.out.println("print peek concept " + s2);
        int s3 = str.search("vv");
        System.out.println("print search concept " + s3);
    }

    //set example
    @Test
    public void set1() {
        // SetMethodExamples set1 = new SetMethodExamples();
        HashSet<Integer> set = new HashSet<>();
        set.add(44);
        set.add(22);
        set.add(44);
        set.add(43);
        set.add(33);
        set.add(33);
        set.add(32);
        System.out.println("add the integer values" + set);

        boolean result = set.contains(37);
        System.out.println("contain using set method " + result);
        set.toArray();
        System.out.println("the set is empty or not " + set);
        set.remove(32);
        System.out.println("remove the value is " + set);
        Iterator<Integer> i = set.iterator();
        System.out.println("iterating over list is " + i.next());
        set.clear();
        System.out.println(set);

    }

    @Test //tree set example
    public void testTreesetExamples() {
        HashSet<String> ts = new HashSet<>();
        ts.add("vidya");
        ts.add("vv");
        ts.add("mounika");
        ts.add("ddi");
        ts.add("vv");
        ts.add("abhi");

        System.out.println("before sorting " + ts);
        Set<String> tset = new TreeSet<>(ts);
        System.out.println("after sorting" + tset);
        tset.add("fox");
        System.out.println("after add the collection is " + tset);
        //  tset.contains("ddi
        boolean rs = tset.contains("ddi");
        System.out.println("this is true or not : " + rs);
        tset.removeAll(tset);
        System.out.println("after removeall " + tset);
        tset.add("vidya");
        System.out.println("again add the values " + tset);
        tset.spliterator();
        System.out.println("using spliterator " + tset);
    }

    @Test //queue example
    public void testQueueExample() {
        Queue<String> qe = new LinkedList<>();
        qe.add("ravali");
        qe.add("veeru");
        qe.add("jansi");
        qe.add("vidya");
        qe.add("mouni");
        qe.add("vv");
        qe.add("vidya");
        System.out.println(qe);
        System.out.println("the peek value is " + qe.peek());
        System.out.println("the poll value is " + qe.poll());
        System.out.println("the again poll " + qe.poll());
        System.out.println("the again poll " + qe.poll());
        //priority queue example
        Queue<String> pqueue = new PriorityQueue<>(qe);
        pqueue.add("vvv");
        pqueue.add("dhanu");
        pqueue.add("deekshu");
        pqueue.add("dhanu");
        System.out.println("the priority queue values is " + pqueue);
        System.out.println("the priority queue in peek " + pqueue.peek());
        System.out.println("the priority queue in poll " + pqueue.poll());
//x below queue converts into set
        Set<String> str = new TreeSet<>(pqueue);
        System.out.println("the queue values are " + str);
    }

    @Test //map example
    public void testMapExample() {
        Map<String, Integer> mapex = new HashMap<String, Integer>();
        mapex.put("vidya", 1);
        mapex.put("divya", 2);
        mapex.put("dhanu", 3);
        mapex.put("deeksha", 4);
        mapex.put("dhanu", 5);
        System.out.println("the map method values are " + mapex);
        mapex.keySet();
        System.out.println("the map in only key set strings " + mapex.keySet());
        System.out.println("the map in only values " + mapex.values());
        boolean result = mapex.isEmpty();
        System.out.println("the map is " + result);

        //   mapex.get("vidya");
        // System.out.println("get the value in map " +  mapex.containsValue(1));
        // System.out.println("the vallue already there are not : " +mapex.putIfAbsent("vidya ",1));
        System.out.println("the map is " + mapex.replace("dhanvi", 1));
        System.out.println(mapex.put("aa", 11));
        Map<String, Integer> map = new LinkedHashMap<>(mapex);

        System.out.println("in linked hashmap in values " + map);
        System.out.println("get the value in map " + mapex.containsValue(map));
        System.out.println("the vallue already there are not : " + mapex.putIfAbsent("vidya ", 1));

    }

}