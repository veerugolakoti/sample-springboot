package com.codexbox.springboot.app.stackexampleprogram;

import java.util.Stack;

public class ExampleStack {
   // public static void main(String[] args) {
        // creating stack
    public void Stackprogram(){

        Stack<String> myStack=new Stack<>();

        //push the stack items
        myStack.push( "ab");
        myStack.push("cd");
        myStack.push("ef");

        System.out.println("Stack :"+ myStack);

        //remove the pop of number
        String numbers=myStack.pop();
        System.out.println("remove numbers :" + myStack);

        //search a number
        String position= String.valueOf(myStack.search("ab"));
        System.out.println("position of ab :"+ position);

        String element=myStack.peek();
        System.out.println("element of peek :" + element);



    }
}
