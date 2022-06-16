package com.codexbox.springboot.app.Veeru.mutlitthreading;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Checking Executor frameworks");
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
