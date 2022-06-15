package com.codexbox.springboot.app.multithreading;

public class MyThread extends Thread{
    int total;
    @Override
    public void run() {
       // System.out.println("i am running");
synchronized (this){
    for (int i = 0; i<5; i++){
        total += i;

    }
    notify();
}

    }
    }






