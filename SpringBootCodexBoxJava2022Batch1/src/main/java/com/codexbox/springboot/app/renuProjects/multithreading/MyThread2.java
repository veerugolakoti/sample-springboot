package com.codexbox.springboot.app.renuProjects.multithreading;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            System.out.println("thread " +i);
        }

    }
}
