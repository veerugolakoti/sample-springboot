package com.codexbox.springboot.app.renuProjects.multithreading;

public class MyThread extends Thread {
    public void run() {
        System.out.println("inside my thread");
        int a = 10, b = 5;
        int sum = a + b;
        System.out.println("sum is " + sum);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread is in sleeping stage");
    }






            //System.out.println("thread  id is  :  "+Thread.currentThread().getId());

        }

