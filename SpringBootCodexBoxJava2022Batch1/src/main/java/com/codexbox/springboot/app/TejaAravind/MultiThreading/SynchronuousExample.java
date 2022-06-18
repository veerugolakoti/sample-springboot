package com.codexbox.springboot.app.TejaAravind.MultiThreading;

public class SynchronuousExample {
    public void send() {
        System.out.println("Sending " + Thread.currentThread().getName() );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            System.out.println("error occured");
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName() +" is send");
    }

}


