package com.codexbox.springboot.app.TejaAravind.MultiThreading;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"  ");

        }
        System.out.println(ThreadExample.currentThread().getState());
        System.out.println("Inside thread Example");
    }
}
