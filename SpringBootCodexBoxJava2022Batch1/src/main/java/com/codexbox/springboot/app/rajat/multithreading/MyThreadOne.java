package com.codexbox.springboot.app.rajat.multithreading;

public class MyThreadOne extends Thread{
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getId());
//        System.out.println(Thread.currentThread().getName());
        System.out.println("MyThreadOne  priority :  "+Thread.currentThread().getPriority());
/*
//        System.out.println("MyThreadOne Id is::"+Thread.currentThread().getId());
        for (int i=1 ; i<=5 ; i++){
            System.out.println("The Number is ::"+i);

        }
        try {
           Thread.sleep(10000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/
    }
}
