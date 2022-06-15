package com.codexbox.springboot.app.collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(123);
      //st.push(125);
      //st.push(223);// st.push(323);
        st.push(236);
       // st.add(2,203);
        st.lastElement();
        //System.out.println( "printing the values"+ st);
      //  System.out.println("removes the pop element" + st.pop());// it means last element will be display
       // System.out.println("removes the pop element " + st.peek() );// last element before value will be given
        System.out.println("enter the last element  " + st.lastElement());
       // System.out.println(st.pop());
        //System.out.println("after pop operation is : " + st );
    }
}
