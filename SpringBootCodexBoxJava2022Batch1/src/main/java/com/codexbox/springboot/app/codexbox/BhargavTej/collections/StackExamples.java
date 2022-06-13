package com.codexbox.springboot.app.codexbox.BhargavTej.collections;

import java.util.Stack;

public class StackExamples {
   public void addmystack() {
        Stack<String> stack = new Stack<>();
       stack.push("Dwararm"); //Use push method to add any data.
       stack.push("Bhargava");
       //Its accepting add method also becoz stack immediate parent is Vector.
       stack.add("Sai");
       stack.push("Teja");
       System.out.println(stack);
   }

   public void retriveStackElement(){
       Stack<String> stack = new Stack<>();
       stack.push("Dwaram"); //Use push method to add any data.
       stack.push("Bhargava");
       //Its accepting add method also becoz stack immediate parent is Vector.
       stack.push("Sai");
       stack.push("Teja");
       System.out.println("Add stack elements: " + stack);
       System.out.println("In Stack peek method,element is popped up and not removed from that stack & shows last element:"  + stack.peek());
       System.out.println("Stack Peek " + stack);
       System.out.println("In Stack pop method,element is popped up and removed from that stack & shows last element: " + stack.pop());
       System.out.println("Stack pop " + stack);
       System.out.println("Remove Element based n index: " + stack.remove(1));
       System.out.println("After removing element remaining elements are  " + stack);
       System.out.println("Replace the Dwaram element with new word:" + stack.set(0, "Bhargava"));
       System.out.println(stack);
   }

}
