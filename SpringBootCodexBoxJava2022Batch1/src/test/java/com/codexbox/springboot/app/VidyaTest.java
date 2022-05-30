package com.codexbox.springboot.app;

import com.codexbox.springboot.app.collections.ExampleStack;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

public class VidyaTest {
    @Test
    public void Test(){
        ExampleStack exampleStack = new ExampleStack();
        Stack<String> str = new Stack<>();
        boolean result = str.empty();
        System.out.println("the stack is empty : " +result);
        str.push("anusha");
        str.push("ramya");
        str.push("ram");
        str.push("vv");
        result = exampleStack.Stackmethod();
        System.out.println("elements in stack :" +str);
        System.out.println("the stack is empty : " +result);
        String s = str.pop();
        System.out.println("print pop concept "  + s);
        String s2 = str.peek();
        System.out.println("print peek concept "  + s2);
        int s3 = str.search("vv");
        System.out.println("print search concept " + s3);



    }




}
