package com.codexbox.springboot.app.rehana.multithreading;

public class MyThread2 extends Thread{
    public  void run(){
        int a=10;
        int b=20;
        int sum =a+b;
        System.out.println("inside my thread2");
        System.out.println(sum);
        /*try {
            Thread.sleep(1000l);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
      //  System.out.println( MyThread2.getState());
       // System.out.println( Thread.interrupted());


    }
}
