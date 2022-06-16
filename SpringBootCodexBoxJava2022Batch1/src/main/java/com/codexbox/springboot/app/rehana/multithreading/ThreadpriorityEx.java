package com.codexbox.springboot.app.rehana.multithreading;

public class ThreadpriorityEx extends Thread {
    public void run(){
        System.out.println("priority of thread is:"+Thread.currentThread().getPriority());


    }
}
