package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("I am in  Class MYThread and priority is : "+ Thread.currentThread().getPriority());
    }
}
