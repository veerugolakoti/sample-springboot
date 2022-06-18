package com.codexbox.springboot.app.HarshaDeepthi.Threadsexamples;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(" Harsha ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
