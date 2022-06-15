package com.codexbox.springboot.threading;

public class MyThread1 extends Thread {
    //  @Override
    public void run() {
        String s = "sasi";
        String s1 = "kumar";
        System.out.println("after adding name is :" + s + s1);
        System.out.println("my thread name is in run method: " + Thread.currentThread().getName());
        System.out.println("my thread  id is in run method: " + Thread.currentThread().getId());

//
//
//    }
    }
}