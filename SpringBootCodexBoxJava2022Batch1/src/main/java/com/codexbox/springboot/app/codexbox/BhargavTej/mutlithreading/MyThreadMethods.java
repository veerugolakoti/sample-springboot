package com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading;

public class MyThreadMethods  extends Thread {
    public static void main(String[] args) {
        WaitMethodExample waitmethod = new WaitMethodExample();

        new Thread() {
            @Override
            public void run() {
                waitmethod.fireBullets(20);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                waitmethod.reload();
            }
        }.start();


    }

















//    @Override
    /*public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" i am running in MyThreadMethod ");
            notify();

        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }*/
}
