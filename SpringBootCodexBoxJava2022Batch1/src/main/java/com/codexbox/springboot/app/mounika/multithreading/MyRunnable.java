package com.codexbox.springboot.app.mounika.multithreading;

public class MyRunnable implements Runnable{
    public void method() {
        System.out.println("this is my method");

    }

    @Override
    public void run() {
        System.out.println("method1");
    }
}
