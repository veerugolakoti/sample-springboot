package com.codexbox.springboot.app.dinesh202270;

public class MyThread2 extends Thread {

    public void run()
    {

        System.out.println(
                "Thread " + Thread.currentThread().getId()
                        + Thread.currentThread().getName());
    }

}
