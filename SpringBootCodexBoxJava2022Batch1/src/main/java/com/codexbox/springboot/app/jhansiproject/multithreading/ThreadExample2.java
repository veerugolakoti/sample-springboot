package com.codexbox.springboot.app.jhansiproject.multithreading;

public class ThreadExample2 extends Thread {

    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(200);
                System.out.println(i);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
