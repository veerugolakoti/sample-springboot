package com.codexbox.springboot.app.jhansiproject.multithreading;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<=5;i++) {
            System.out.println("inside my main method"+Thread.currentThread().getId());
        }
    }
}
