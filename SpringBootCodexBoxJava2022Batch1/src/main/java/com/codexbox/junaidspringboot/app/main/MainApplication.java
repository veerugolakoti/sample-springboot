package com.codexbox.junaidspringboot.app.main;

import com.codexbox.junaidspringboot.app.interviewpreparation.ChildClass1;
import com.codexbox.junaidspringboot.app.interviewpreparation.ChildClass2;
import com.codexbox.junaidspringboot.app.interviewpreparation.ParentClass;
import com.codexbox.junaidspringboot.app.springboot.StackExamples;

public class MainApplication
{
    public static void main(String[] args)
    {
//        StackExamples stackExamples = new StackExamples();
//
//        stackExamples.getNormalStackValues();
//
//        stackExamples.getTypeSafetyStackValues();

        System.out.println("=====================Interview Preparation=================");

        ParentClass childClass = new ChildClass1();

        childClass.parentMethod();
    }
}


