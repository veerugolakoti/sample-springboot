package com.codexbox.springboot.app.rajat.synchronization;

public class ThreadClass1 extends Thread{
    SynchronizedMethodClass r;
    public ThreadClass1(SynchronizedMethodClass r){
        this.r=r;
    }
    public void run(){
        r.printNumber(5);
    }
}
