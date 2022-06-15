package com.codexbox.springboot.app.rajat.multithreading;

public class myThread4 extends Thread {
    public void run(){
        for (int i=1 ; i<=5 ; i++){
            System.out.println("The Number is ::"+i);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("rajat");
//        System.out.println("MyThread4 priority :"+Thread.currentThread().getPriority());
    }
}
