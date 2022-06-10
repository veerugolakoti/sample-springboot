package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vidyadarna.fileInputOutput.*;
import com.codexbox.springboot.app.vidyadarna.collections.ExampleStack;
import com.codexbox.springboot.app.vidyadarna.Employee;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

        Employee employee1 = new Employee("veeru", 100, "hyd");
        Employee employee2 = new Employee("abhi", 104, "sidhipet");
        Employee employee3 = new Employee("sandya", 105, "jangon");
        Employee employee4 = new Employee("sravani", 106, "gnp");
        Employee employee5 = new Employee("sathya", 166, "tkd");
        Employee employee6 = new Employee("kavya", 177, "uppal");

        Map<String, Employee> employeeMap = new TreeMap<>();
        employeeMap.put("employee1", employee1);
        employeeMap.put("employee2", employee2);
        employeeMap.put("employee3", employee3);
        employeeMap.put("employee4", employee4);
        employeeMap.put("employee5", employee5);
        employeeMap.put("employee6", employee6);
        System.out.println("my employee map is : " + employeeMap);

        Collection<Employee> employeelist = employeeMap.values();
        for (Employee employee : employeelist) {
            System.out.println("employee Map : " + employee.getEmployeeName());
        }
        Employee employee = employeeMap.get("employee2");
        System.out.println("employee name 2 is : " + employee.getEmployeeName());
        System.out.println("my map is  " + mapex);
        System.out.println("vidya value is " + mapex.get("vidya"));
        Set<String> myKst = mapex.keySet();
        System.out.println("my all keys from my map " + myKst);
        //  Set<Integer> mykst = mapex.keySet();

        System.out.println("my all values from my map " + mapex.values());
        for (Map.Entry<String, Employee> emp : employeeMap.entrySet()) {
            System.out.println("my key :   " + emp.getValue().getEmployeeId() + " my value :" + emp.getValue().getEmployeeName());
        }
    }

    @Test
    public void sortTestExample() {
        SortedMap<Integer, String> sm = new TreeMap<>();
        sm.put(9, "vidya");
        sm.put(2, "mounika");
        sm.put(3, "thara");
        sm.put(7, "kavitha");
        sm.put(8, "ravali");
        System.out.println("the values in soring map " + sm);
    }

    @Test
  public  void TestIO() throws IOException {
      InputOutputStreamExample example = new InputOutputStreamExample();
        example.inputOutputStreamExample();
//        for(int i = 0; i < 5; i++) {
//            System.out.println(i +" ");
//        }
    }
@Test
    public void TestBuferedInputOutput(){
    BufferedInputOutputExample buffered = new BufferedInputOutputExample();
    buffered.bufferedInputStream();
}
@Test
    public void TestCharArray() throws IOException {
    CharArrayExample charRW = new CharArrayExample();
    charRW.charArrayExample();

}
@Test
    public  void TestSequence() throws IOException {
    SequenceExample sequenceExample = new SequenceExample();
sequenceExample.sequenceInputStream();
}
@Test
    public  void  TestByteArray() throws IOException {
    ByteArrayExample byteArrayExample = new ByteArrayExample();
    byteArrayExample.byteArray();
}
@Test
    public void TestDataStreamExample() throws IOException {
        DataStreamExample dataStreamExample = new DataStreamExample();
        dataStreamExample.dataStream();
}
}