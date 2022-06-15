package com.codexbox.springboot.app;

import Multithreading.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        /*Mythread1 mythread1 = new Mythread1();
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

        }*/

       /* MyPrirority myPrirority=new MyPrirority();
        MyPrirority myPrirority1=new MyPrirority();
        MyPrirority myPrirority2=new MyPrirority();
        System.out.println("s1 thread"+myPrirority.getPriority());
        System.out.println("s2 thread"+myPrirority1.getPriority());
        System.out.println("s3 thread"+myPrirority2.getPriority());
        myPrirority.setPriority(2);
        myPrirority1.setPriority(2);
        myPrirority2.setPriority(9);
        System.out.println("s1 thread " +myPrirority.getPriority());
        System.out.println("s2 thread " +myPrirority1.getPriority());
        System.out.println("s3 thread " +myPrirority2.getPriority());
        System.out.println("current thread name "+Thread.currentThread().getName());
        System.out.println("current  thread "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("current thread value "+Thread.currentThread().getPriority());
        MyPrirority myPrirority3=new MyPrirority();
        System.out.println("new thread prirority value"+myPrirority3.getPriority());*/
     final int maxthreads=3;
Runnable r1=new TaskPoll("task1");
Runnable r2=new TaskPoll("task2");
Runnable r3=new TaskPoll("task3");
Runnable r4=new TaskPoll("task4");
Runnable r5=new TaskPoll("task5");
Runnable r6=new TaskPoll("task6");
          ExecutorService ex=Executors.newFixedThreadPool(maxthreads);
          ex.execute(r1);
          ex.execute(r2);
          ex.execute(r3);
          ex.execute(r4);
          ex.execute(r5);
          ex.execute(r6);
          ex.shutdown();
    }
}

