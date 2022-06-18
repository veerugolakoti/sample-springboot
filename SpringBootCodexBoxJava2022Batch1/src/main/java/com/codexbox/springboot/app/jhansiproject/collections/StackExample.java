package com.codexbox.springboot.app.jhansiproject.collections;

import java.util.List;
import java.util.Stack;

public class StackExample {
     public void Stackoperations(){
         Stack<String> stacklist =new Stack<>();
         stacklist.push("jhansi");
         stacklist.push("renu");
         stacklist.push("swath");
         stacklist.push("harsh");
         System.out.println(stacklist.size());


         for (int i=0;i<4;i++)
         {
             System.out.println(stacklist.pop());

         }
     }

}
