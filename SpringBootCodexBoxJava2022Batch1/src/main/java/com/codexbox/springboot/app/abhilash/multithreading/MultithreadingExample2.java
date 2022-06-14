package com.codexbox.springboot.app.abhilash.multithreading;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MultithreadingExample2 extends Thread{
    public void run() {
        int a = 10;
        int b = 30;
        int c= a+b;
        System.out.println("MultithreadingExample2 id is: " + MultithreadingExample2.currentThread().getId());
        System.out.println("MultithreadingExample2 name is: " + MultithreadingExample2.currentThread().getName());
        System.out.println(getState());
        try {
            MultithreadingExample2.sleep(1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("sum is: " + c);
    }
}
