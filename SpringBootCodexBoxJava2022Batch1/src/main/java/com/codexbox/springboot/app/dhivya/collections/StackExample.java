package com.codexbox.springboot.app.dhivya.collections;

import java.util.AbstractList;
import java.util.Stack;

public class StackExample {
    public void stackoperation() {
        Stack<String> mystack=new Stack<>();
        mystack.push("Divya");
        mystack.push("mouni");
        mystack.push("dinesh");
        mystack.push("sohail");
        System.out.println("Stack : "  + mystack);
        mystack.pop();
        mystack.pop();
        System.out.println("pop : " + mystack);

        System.out.println("peek : " + mystack.peek());
        System.out.println("peek1 : " + mystack.peek());

    }








}

