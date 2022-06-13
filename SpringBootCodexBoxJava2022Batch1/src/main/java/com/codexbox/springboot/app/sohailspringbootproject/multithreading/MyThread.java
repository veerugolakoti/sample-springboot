package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("I am in  Class MYThread and in Run method : ");
    }


    @Override
    public synchronized void start() {
        System.out.println("I am in  Class MYThread and in Start method : ");
    }
}
