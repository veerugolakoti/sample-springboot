package com.codexbox.springboot.app.vasu.sample.collections;

import java.util.Stack;

public class StackExample1 {
    public void stackoperations(){
        Stack<String>mystack=new Stack<>();
        // push
        mystack.push("vaasu");
        mystack.push("vaasu1");
        mystack.push("vaasu2");
        mystack.push("vaasu3");
        System.out.println(mystack);
        // pop
        mystack.push("vaasu");
        mystack.push("vaasu1");
        mystack.push("vaasu2");
        mystack.push("vaasu3");
        System.out.println(mystack);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());



    }
}
