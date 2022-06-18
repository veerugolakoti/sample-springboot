package com.codexbox.springboot.app.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

    // adding elements using push() method
    //void stack_push(){
        Stack<String> stack = new Stack<>(); //initialization of stack using generics
        stack.push("I will crack top product based companies in 2022");
        stack.push("For which I need uR complete support");
        stack.push("God help me ");

        System.out.println(stack);
        //finding element at top of the stack
        System.out.println("element at the top:- " +stack.pop());
        System.out.println("returns the top element " +stack.peek());
    }


}
