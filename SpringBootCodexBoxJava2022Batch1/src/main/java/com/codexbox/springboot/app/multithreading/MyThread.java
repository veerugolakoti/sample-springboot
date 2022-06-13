package com.codexbox.springboot.app.multithreading;

public class MyThread extends Thread{
       public void mythreadMethod(){
        MyThread myThread = new MyThread();
        System.out.println("Thread id:"+ myThread.getId());
        System.out.println("Thread name:"+myThread.getName());

        MyThread myThread1 = new MyThread();
        System.out.println("Thread id:"+ myThread1.getId());
        System.out.println("Thread name:"+ myThread1.getName());

        System.out.println("Thread id:" + Thread.currentThread().getId());
        System.out.println("Thread name:"+ Thread.currentThread().getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());

    }



        }


