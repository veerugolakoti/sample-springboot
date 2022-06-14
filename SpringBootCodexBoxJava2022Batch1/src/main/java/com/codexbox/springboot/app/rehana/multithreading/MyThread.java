package com.codexbox.springboot.app.rehana.multithreading;

public class MyThread extends Thread{
    public void run(){
        System.out.println("in side my thread");
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
        try {
             Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
            System.out.println( Thread.activeCount());
            System.out.println(Thread.currentThread().getId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

}
