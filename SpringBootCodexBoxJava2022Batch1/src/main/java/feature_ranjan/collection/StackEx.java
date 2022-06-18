package feature_ranjan.collection;

import java.util.Stack;

public class StackEx {
    public void stackMethod(){
        Stack<String> myList = new Stack<>();
        System.out.println("hi guys u all r fine:");
        myList.push("Hi ");

        myList.push("guys ");
        myList.pop();
        myList.push("u all are fine");

        System.out.println("testing empty method in stack:"+myList.empty());
        System.out.println("removing guys:"+myList);
        myList.peek();
        System.out.println(myList);

    }
}
