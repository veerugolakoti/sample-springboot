package com.codexbox.springboot.app.rajat.multithreading;

public class MyThread4 extends Thread {
    public void run(){
        System.out.println("MyThread4 priority :"+Thread.currentThread().getPriority());
    }
}
