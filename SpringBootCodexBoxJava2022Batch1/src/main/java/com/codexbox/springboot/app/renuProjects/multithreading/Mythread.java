package com.codexbox.springboot.app.renuProjects.multithreading;

public class Mythread extends Thread{
    public void run() {
       System.out.println("inside my thread");
       int a=10,b=5;
       int sum=a+b;
       System.out.println("sum is " + sum);
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("thread is in sleeping stage");


        int s=10,v=2;
        int mul=s*v;
        System.out.println("inside my second thread");
        System.out.println("mul is "+mul );

       //System.out.println("thread  id is  :  "+Thread.currentThread().getId());
    }
}
