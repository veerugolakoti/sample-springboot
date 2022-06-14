package com.codexbox.springboot.app.rajat.multithreading;

public class MyThread5 extends Thread {
    public void run(){
        System.out.println("MyThread5 priority :"+Thread.currentThread().getPriority());
    }
}
