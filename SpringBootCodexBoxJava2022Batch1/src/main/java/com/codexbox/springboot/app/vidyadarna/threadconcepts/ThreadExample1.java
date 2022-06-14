package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class ThreadExample1 implements Runnable {


    @Override
    public void run() {
        System.out.println("my thread is running");
    }
}
