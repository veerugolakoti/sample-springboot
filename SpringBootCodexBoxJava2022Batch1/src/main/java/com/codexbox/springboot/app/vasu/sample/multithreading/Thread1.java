package com.codexbox.springboot.app.vasu.sample.multithreading;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread inside method");
        System.out.println("########");
    }
}
