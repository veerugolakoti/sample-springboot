package com.codexbox.springboot.app.mounika.multithreading;

public class Threading  extends Thread{
    @Override
    public void run() {
        System.out.println(" Thread elements is ");



    }

    @Override
    public synchronized void start() {
        System.out.println("Thread elements are");
    }
}

