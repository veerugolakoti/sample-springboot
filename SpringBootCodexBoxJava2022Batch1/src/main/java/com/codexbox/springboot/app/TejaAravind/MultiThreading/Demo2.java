package com.codexbox.springboot.app.TejaAravind.MultiThreading;

public class Demo2 extends Thread{
    SynchronuousExample se;
    String str;
    public Demo2(SynchronuousExample sync){
        this.se = sync;
        this.str =str;

    }
    @Override
    public void run(){
        synchronized (se){
            se.send();

        }
    }

}