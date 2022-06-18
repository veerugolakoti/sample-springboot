package com.codexbox.springboot.app.thread;

public class ThreadExample extends Thread{

    public void run(){
        System.out.println("my first main thread");


    for(int i=0; i<=5; i++){
        System.out.println("the no. of threads are :" +i);
    }
    try{
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        System.out.println(Thread.currentThread().getState());
    }

}
