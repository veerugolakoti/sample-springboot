package com.codexbox.springboot.app.rajat.synchronization;

public class ThreadClass2 extends Thread{
    SynchronizedMethodClass r;
    public ThreadClass2(SynchronizedMethodClass r){
        this.r=r;
    }
    public void run(){
        r.printNumber(100);
    }
}
