package fileInputStream;

import strings.PracticeJavaBasics;
import thread.ThreadExamples;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
//        PracticeJavaBasics prb = new PracticeJavaBasics();
//        prb.test();
        ThreadExamples tE = new ThreadExamples();
        System.out.println("state in side tE "+tE.getState());
        System.out.println("Priority  "+tE.getPriority());
        System.out.println("thread name obj "+tE.getName());
        System.out.println("thread id obj "+tE.getId());

        ThreadExamples te1 = new ThreadExamples();
        System.out.println("state inside te1 "+te1.getState());
        System.out.println("Priority te1  "+te1.getPriority());
        System.out.println("new object name :"+te1.getName());
        System.out.println("new object id :"+te1.getId());
        Thread td = new Thread();
        System.out.println("Priority td "+td.getPriority());
        System.out.println(td.getName());
        System.out.println(td.getId());


        tE.threadMethods();
        tE.run();
    }
}
