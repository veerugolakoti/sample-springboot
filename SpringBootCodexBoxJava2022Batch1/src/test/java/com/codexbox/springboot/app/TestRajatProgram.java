package com.codexbox.springboot.app;

import com.codexbox.springboot.app.rajat.multithreading.*;
import org.junit.jupiter.api.Test;

public class TestRajatProgram {
    @Test
    public void testMyThread() {

        int a = 10,b = 20,c=a+b;
        System.out.println(c);


        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());

        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.run();
        System.out.println(myThreadOne.getState());
        myThreadOne.run();
        myThreadOne.start();
        try {
            Thread.sleep(10000);
            System.out.println("enter");
            myThreadOne.start();
            System.out.println("after");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (IllegalThreadStateException i){
            System.out.println("yOU CAN NOT CALL TWO START METHOD AT A TIME");
        }


        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());

        System.out.println(myThreadOne.getState());
        System.out.println(myThreadOne.getStackTrace());
        System.out.println(myThreadOne.getClass());
        try {
            myThreadOne.start();
        }catch (IllegalThreadStateException i){
            System.out.println("yOU CAN NOT CALL TWO START METHOD AT A TIME");
        }
        System.out.println(myThreadOne.getId());
        System.out.println(myThreadOne.getName());

        MyThreadOne myThreadOne1 = new MyThreadOne();
        System.out.println(myThreadOne1.getId());
        System.out.println(myThreadOne1.getName());
        System.out.println(myThreadOne1.getPriority());
        myThreadOne1.start();
        System.out.println(myThreadOne1.getState());

        Thread thread = new Thread();

        System.out.println(thread.getId());
        System.out.println(thread.getName());

    }
    @Test
    public void testMyThread2(){
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());


        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.setPriority(3);
        System.out.println(myThread2.getState());

        MyThread2 myThread3 = new MyThread2();
        myThread3.setPriority(10);
        myThread3.start();

        MyThread2 myThread4 = new MyThread2();
        myThread4.setPriority(7);
        myThread4.start();
        try {
            myThread2.sleep(10000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("half of the Program");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(myThread2.getPriority());
        System.out.println( myThread2.getState());
     /*   String terminated  = "TERMINATED";

       if(myThread2.getState().equals(terminated)){
           myThread2.start();
        }
       System.out.println(myThread2.getPriority());*/

    }
    @Test
    public void testWithOutExtendingThreadClass(){
        MyThreadOne myThreadOne = new MyThreadOne();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        Thread thread = new Thread(myThread3);
        MyThread4 myThread4 = new MyThread4();
        MyThread5 myThread5 = new MyThread5();

        myThreadOne.setPriority(6);
        myThread2.setPriority(3);
        thread.setPriority(7);
        myThread4.setPriority(9);
        myThread5.setPriority(10);

        myThreadOne.start();
        myThread2.start();
        thread.start();
        myThread4.start();
        myThread5.start();
    }
}
