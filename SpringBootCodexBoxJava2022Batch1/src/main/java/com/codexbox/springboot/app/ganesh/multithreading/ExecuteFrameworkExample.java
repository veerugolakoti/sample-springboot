package com.codexbox.springboot.app.ganesh.multithreading;

public class ExecuteFrameworkExample implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("This is executing framework");
    }
}

