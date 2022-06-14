package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

public class MyThread1 implements  Runnable{
    @Override
    public void run() {
        System.out.println("I am in my Class MyThread1 and priority is :"+Thread.currentThread().getPriority());
    }
}
