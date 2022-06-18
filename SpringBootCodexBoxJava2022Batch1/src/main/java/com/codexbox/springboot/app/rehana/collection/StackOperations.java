package com.codexbox.springboot.app.rehana.collection;

import java.util.*;

public class StackOperations {
    public void operations() {
        Stack<String> mystack = new Stack<>();
        mystack.push("abc");
        mystack.push("ghi");
        mystack.push("jkl");
        mystack.push("ddes");
        System.out.println(mystack);
//        mystack.pop();
       System.out.println("Stack after pop :"+mystack);
        System.out.println(  mystack.search("ghi"));
        System.out.println(mystack.empty());
        System.out.println( mystack.capacity());
        System.out.println( mystack.iterator().hasNext());
        System.out.println("search " + mystack.search("jkl"));




    }

}
