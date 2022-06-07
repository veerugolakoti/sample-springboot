package com.codexbox.springboot.app;

import com.codexbox.springboot.app.renuProjects.assessments.EmployeeDetails;
import com.codexbox.springboot.app.renuProjects.assessments.StudentDetails;
import com.codexbox.springboot.app.renuProjects.collections.ExampleOfQueue;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RenuTest {

    @Test
    void stackTestExample(){
        Stack<String> strstack=new Stack<>();
        strstack.add("renu");
        strstack.add("ravali");
        strstack.add("jansi");
        for (String str1:strstack) {
            System.out.println(str1);
        }
        System.out.println("================");
        System.out.println(strstack.peek());

        System.out.println(strstack.size());
        System.out.println(strstack.push("swathi"));
        System.out.println("==================");
        Stack<String> strstack2=new Stack<>();
        strstack2.addAll(strstack);
        System.out.println(strstack2);
        System.out.println(strstack2.pop());
        System.out.println(strstack2);

    }

    @Test
      void QueueMethod(){
        ExampleOfQueue example=new ExampleOfQueue();
        example.QueueMethod();

    }


    @Test
    public void setExamples(){
        HashSet<Character> charset=new HashSet<>();
        charset.add('d');
        charset.add('b');
        charset.add('c');
        charset.add('c');
        charset.add('a');
        charset.add('e');
        charset.add('g');
        charset.add('f');

        System.out.println(charset);
        System.out.println(charset.stream().count());
        System.out.println(charset.equals('c'));
        System.out.println(charset.contains('c'));
        ArrayList<Character> chararray=new ArrayList<>(charset);
        System.out.println(chararray);
        System.out.println(chararray.get(5));

    }


 @Test
    void exampleOfLinkedHashSet(){
     LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("apple");
        names.add("cat");
        names.add("dog");
        names.add("1");
        names.add("elephant");
        names.add("book");
        names.add("@,3");
     System.out.println(names);
     System.out.println(names.hashCode());
     System.out.println(names.size());
     TreeSet<String> setnames=new TreeSet<>();
     setnames.addAll(names);
     System.out.println(setnames);
     //System.out.println(setnames.descendingIterator());
     System.out.println(setnames.first());
     System.out.println(setnames.pollFirst());
     System.out.println(setnames.pollLast());
 }

  @Test
    void mapExample(){
        Map<String,Integer> mapname=new HashMap<>();
        mapname.put("jansi",60);
        mapname.put("ravali",65);
        mapname.put("divya",71);
        mapname.put("swathi",69);
        mapname.put("jansi",61);
      System.out.println(mapname);
      System.out.println(mapname.size());
      System.out.println(mapname.keySet());
      System.out.println(mapname.get("jansi"));

      EmployeeDetails emp1=new EmployeeDetails("harsha",90,"hyd");
      EmployeeDetails emp2=new EmployeeDetails("mounika",72,"ongole");
      EmployeeDetails emp3=new EmployeeDetails("shiva",95,"hyd");

      Map<String,EmployeeDetails> empdetails=new HashMap<>();
      empdetails.put("employee1" , emp1);
      empdetails.put("employee2" , emp2);
      empdetails.put("employee3" , emp3);

      System.out.println(empdetails);
      Collection<EmployeeDetails> empcollection=empdetails.values();

      for (EmployeeDetails emp:empcollection) {
          System.out.println(emp.getEmpid());
      }

      EmployeeDetails emp = empdetails.get("employee2");
      System.out.println(emp.getEmpname());


      for (Map.Entry<String, EmployeeDetails> entry : empdetails.entrySet()) {
          System.out.println(entry.getKey( ) +" "+entry.getValue().getEmpname()+" "+entry.getValue().getEmpid()+" "+entry.getValue().getAddress());
      }

  }





}
