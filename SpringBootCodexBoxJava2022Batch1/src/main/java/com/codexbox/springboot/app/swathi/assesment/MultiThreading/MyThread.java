package com.codexbox.springboot.app.swathi.assesment.MultiThreading;

public class MyThread extends Thread{
 /* @Override
    public void run() {
        System.out.println("m1");
        System.out.println("m2");
    }*/
  /*  public void m1() {
        System.out.println("Method-1");
    }
    public void m2(){
        System.out.println("Method-2");
    }
    public void m3(){
        System.out.println("Method-3");
    }*/
    public synchronized void method() {
    System.out.println("this is my notify method");
    notify();
     }
     public synchronized void method1() {
         System.out.println("this is wait method ");
         try {
             wait();

         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }
      }
