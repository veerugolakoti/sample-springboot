package com.codexbox.junaidspringboot.app.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExamples
{
         public void getNormalStackValues()
    {
        Stack<Object> stackList = new Stack<>();
        stackList.push("Codex Box");
        stackList.push("Organisation");
        stackList.push("StackPeek Method");
        stackList.push("peek method");

        System.out.println(stackList);

        System.out.println(stackList.empty());

        System.out.println(stackList.peek());

        System.out.println(stackList.pop());

        stackList.push("JAVA");

        System.out.println(stackList);

        System.out.println(stackList.search("Organisation"));
    }
         public void getTypeSafetyStackValues()
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("Fayaz");
        stringList.add("sohail");
        stringList.add("Ajaz");
        stringList.add("For the next two years..");


        Stack<String> stringStack = new Stack<>();
        stringStack.push("L Mohammed Junaid");
        stringStack.push("Currently Working in Codex Box Organisation");
        stringStack.push("For the next two years..");
        System.out.println( "After using removeall() method: " + stringStack.removeAll(stringList));

        System.out.println(stringList);
        System.out.println(stringStack);
    }
}
