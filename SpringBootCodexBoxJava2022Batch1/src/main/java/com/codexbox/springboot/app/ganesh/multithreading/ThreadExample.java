package com.codexbox.springboot.app.ganesh.multithreading;

public class ThreadExample extends Thread{
    public   void run()
    {
        for (int i = 1; i < 5; i++) {
            System.out.println("My nuber is="+i);
        }
        try {
            Thread.sleep(2000);
            System.out.println(getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
