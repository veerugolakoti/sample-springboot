package com.codexbox.springboot.app.abhilash.collection;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Stack;
@Component
public class StackExample {
    Stack<Integer> stack = new Stack<>();
    int i;
    public void push_operation() {
        for( i=0 ;i<5; i++) {
            System.out.println(stack.push(i));
        }
            System.out.println("pop_ed element is :" + stack.pop());
            System.out.println("peek element is: " + stack.peek());
        }
    }

