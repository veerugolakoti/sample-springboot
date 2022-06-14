package com.codexbox.springboot.app.abhilash.multithreading;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class MultitreadingExample extends Thread{
    public void mythread() {
        System.out.println(" i am in my thread");

    }
    @Override
    public void run() {
        System.out.println("i am in multi threading example 1");

    }
}
