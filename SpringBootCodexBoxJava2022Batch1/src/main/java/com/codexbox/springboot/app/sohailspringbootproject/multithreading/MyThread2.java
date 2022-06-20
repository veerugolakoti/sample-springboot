package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("I am in MyThread2 and the priority : "+Thread.currentThread().getPriority());
    }
}
