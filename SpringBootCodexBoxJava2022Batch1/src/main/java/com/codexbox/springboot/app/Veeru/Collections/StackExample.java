package com.codexbox.springboot.app.Veeru.Collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {
   public  List<String> stackOperations() {
       Stack<String> myStack = new Stack<>();
       myStack.push("name1");
       myStack.push("name2");
       System.out.println("my stack size: " + myStack.size());
       myStack.pop();
       myStack.pop();
       System.out.println("my stack size after Poping:  " + myStack.size());
       try {
           myStack.add(0, "veeru");
       } catch (UnsupportedOperationException use) {
           System.out.println("Got unsupported exception and this is expected");
       }
       ArrayList<String> myList = new ArrayList<>();
       myList.add(0, "Dinesh");
       return myStack;
    }
}
