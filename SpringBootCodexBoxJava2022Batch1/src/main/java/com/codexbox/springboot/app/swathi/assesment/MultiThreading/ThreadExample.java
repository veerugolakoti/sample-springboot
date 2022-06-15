package com.codexbox.springboot.app.swathi.assesment.MultiThreading;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("my thread is " + Thread.currentThread().getName());
        System.out.println("my thread id is " + Thread.currentThread().getId());

    }
}
