package com.codexbox.springboot.app.HarshaDeepthi.Threadsexamples;

public class Runnableimpnts implements Runnable{
    @Override
    public void run() {
        System.out.println("Divya");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
