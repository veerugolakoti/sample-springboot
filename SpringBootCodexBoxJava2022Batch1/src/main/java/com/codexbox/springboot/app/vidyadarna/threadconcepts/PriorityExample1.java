package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class PriorityExample1 extends Thread{
    @Override
    public void run() {
        int a = 10;
        int b = 34;

        int c = a+b;
        System.out.println("priority1 of my sum is : "+c);
        System.out.println("addition programme  ");
        System.out.println( PriorityExample1.currentThread().getState());
        try {
            PriorityExample1.sleep(1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("my priority1Example complete");
    }
}
