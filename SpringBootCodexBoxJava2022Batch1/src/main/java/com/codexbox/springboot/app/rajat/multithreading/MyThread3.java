package com.codexbox.springboot.app.rajat.multithreading;

public class MyThread3 implements Runnable {
    public synchronized void run(){
        System.out.println("Rajat Kumar Behera");
        System.out.println("MyThread3 priority :"+Thread.currentThread().getPriority());
    }
}
