package com.codexbox.springboot.app.jhansiproject.multithreading;

public class SetPriorityExample extends Thread{
    @Override
    public void run() {
        System.out.println("priority of thread is:"+Thread.currentThread().getPriority());


    }

    }

