package com.codexbox.springboot.app;

import Enumeration.Size;
import Enumeration.Week;
import FileOperations.*;
import Multithreading.Mythread;
import Multithreading.Mythread1;
import Multithreading.ThreadExample;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestNagarjuna {

    @Test
//public void getValue() {
//    public void operations() {
       /* HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();*/
       /* LinkedHashOperations linked = new LinkedHashOperations();
        linked.testOperations();*/
       /* QueueOperations qs=new QueueOperations();
        qs.testOperations();*/
        /*MapOperations mp=new MapOperations();
        mp.testOperations();*/
        /*System.out.println(Week.FRIDAY.ordinal());
        System.out.println(Week.SATURDAY.name());
        System.out.println(Week.THURSDAY.getValue());
        System.out.println(Week.MONDAY.compareTo(Week.SATURDAY));
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.LARGE.getValue());
        System.out.println(Size.EXTRALARGE.toString());

*/
    /*public void inputOutputOperations() throws IOException {
        InputOutputStream inputexample=new InputOutputStream();
        inputexample.inputOutputOperations();*/
//  public void inputOutputOperations() throws IOException {
//        Date on 9-06-22
        /*FileSingleCharacter fsc=new FileSingleCharacter();
        fsc.inputOutputOperations();*/
       /* FileOutput fo=new FileOutput();
        fo.inputOutputOperations();*/
        /*FileReaderExample fre=new FileReaderExample();
        fre.inputOutputOperations();*/
       /* SequenceStream ss=new SequenceStream();
        ss.inputOutputOperations();*/
        /*SequenceStream1 ss1=new SequenceStream1();
        ss1.inputOutputOperations();*/
        /*CharReader cr=new CharReader();
        cr.inputOutputOperations();*/
       /* CharWriter cw=new CharWriter();
        cw.inputOutputOperations();*/
       /* StrReader sr=new StrReader();
        sr.inputOutputOperations();*/
       /* ByteArray ba=new ByteArray();
        ba.inputOutputOperations();*/
       /* ByteArrayOutStream bao=new ByteArrayOutStream();
        bao.inputOutputOperations();*/
    public void ownThread() {
      /* ThreadExample te = new ThreadExample();
        System.out.println("my thread id "+Thread.currentThread().getId());
        System.out.println("my thread name "+Thread.currentThread().getName());

        System.out.println("my thread id " + te.getId());
        System.out.println("my thread name "+ te.getName());

       ThreadExample te1=new ThreadExample();
       te1.run();
        System.out.println("my thread id" + te1.getId());
        System.out.println("my thread name"+ te1.getName());
       ThreadExample te2=new ThreadExample();
       te2.run();
       System.out.println("my thread id  " + te2.getId());
        System.out.println("my thread name " + te2.getName());
        Thread thread=new Thread();
        thread.run();
        System.out.println("my thread id "+thread.getId());
        System.out.println("my thread id  "+thread.getName());*/

       /* System.out.println(thread.getState());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getStackTrace());
        System.out.println(thread.toString());
        System.out.println(thread.isInterrupted());*/
//----------------------Dated on 14-06-22------------------------
        /*Mythread mythread=new Mythread();
        mythread.run();


        Thread thread=new Thread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());


Thread thread1=new Thread();
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
  try {
            thread.join();
            thread.sleep(20000l);

        } catch (InterruptedException e) {

        }

        System.out.println("I did not sleep");*/
        Mythread1 mythread1 = new Mythread1();
        mythread1.run();
        System.out.println("this thread is inside my class");
        Thread thread = new Thread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

        System.out.println("my thread1");
        System.out.println("my thread2");
        System.out.println("my thread3");
        System.out.println(thread.getState());
        System.out.println(thread.getPriority());

        try {

             Thread.sleep(575l);
        } catch (InterruptedException e) {

            System.out.println("i am awake");

        }
    }
}

