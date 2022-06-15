package com.codexbox.springboot.app.swathi.assesment.MultiThreading;

public class ThreadMethods extends Thread {
    @Override
    public void run() {
        for (int i=0;i<6;i++){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
