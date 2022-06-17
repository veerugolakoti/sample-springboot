package com.codexbox.springboot.app.dhivya.threads;

public class ThreadExample2 implements Runnable{
    @Override
    public void run() {
        System.out.println(" Thread");
        try {
            Thread.sleep(50000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
