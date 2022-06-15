package com.codexbox.springboot.app.dhivya.threads;

public class ThreadExample1 extends Thread {
    public void run(){
//        System.out.println("my name ");
//        System.out.println("is");
        for (int i = 0; i < 10; i++) {
            try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println(i);
        }
        System.out.println("Divya");
    }

}
