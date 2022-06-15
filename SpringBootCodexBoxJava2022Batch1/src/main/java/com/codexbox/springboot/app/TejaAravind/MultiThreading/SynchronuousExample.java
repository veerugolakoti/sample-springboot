package com.codexbox.springboot.app.TejaAravind.MultiThreading;

public class SynchronuousExample extends Thread {

    public String  msg;

    public SynchronuousExample(String msg) {
        this.msg = msg;
    }

    public synchronized void send() {

        System.out.println("Sending " + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            System.out.println("error occured");
            e.printStackTrace();
        }
        System.out.println(msg +" is send");
    }

}
