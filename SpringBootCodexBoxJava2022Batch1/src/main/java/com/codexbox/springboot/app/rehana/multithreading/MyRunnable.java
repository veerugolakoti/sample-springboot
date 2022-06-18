package com.codexbox.springboot.app.rehana.multithreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("executor frame work");
    }
}
