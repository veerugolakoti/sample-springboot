package com.codexbox.springboot.app.vasu.sample.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {
   public void stackoperations(){
       Stack<String>mystack=new Stack<>();
       mystack.push("name1");
       mystack.push("name2");
       try{
           mystack.add(0,"vaasu");
       }catch (UnsupportedOperationException use){
           System.out.println("Got UnsupportedException and it is expects");
       }
       ArrayList<String>mylist=new ArrayList<>();
       mylist.add(0,"vaasu");
       System.out.println(mystack);
       System.out.println(mylist);

   }
}