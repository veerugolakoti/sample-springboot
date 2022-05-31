package com.codexbox.springboot.app.ravalispringboot.collections;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.List;
import java.util.Stack;

public class ExampleStack {

    Stack<Integer>mystack=new Stack<>();

    public  void Mystack(){

       mystack.push(1);
        mystack.push(2);
        mystack.push(3);

        System.out.println("stack:"+mystack);
        System.out.print(9);

        mystack.pop();

    }

}
