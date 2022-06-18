package com.codexbox.springboot.app.jhansiproject.multithreading;

public class ThreadExample extends Thread{
    public void multithreading() {
        System.out.println("inside the thread method");
    }

    @Override
    public void run() {

        System.out.println("thread is:"+currentThread().getId());
    }


    }
