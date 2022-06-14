package com.codexbox.springboot.app.rajat.multithreading;

public class UsingWaitMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Using wait() method ");
        try {
           Thread thread = new Thread();
           thread.wait(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is wait");

    }
}
