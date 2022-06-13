package com.codexbox.springboot.app.rajat.multithreading;

public class MyThreadOne extends Thread{
    @Override
    public void run() {
//        System.out.println("MyThreadOne Id is::"+Thread.currentThread().getId());
        for (int i=1 ; i<=10 ; i++){
            System.out.println("The Number is ::"+i);
        }
    }
}
