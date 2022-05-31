package com.codexbox.springboot.app;

import com.codexbox.springboot.app.renuProjects.assessments.EmployeeDetails;
import com.codexbox.springboot.app.renuProjects.collections.ExampleOfQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
    }




}
