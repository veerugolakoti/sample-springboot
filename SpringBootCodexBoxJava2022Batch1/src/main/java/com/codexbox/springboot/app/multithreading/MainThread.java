package com.codexbox.springboot.app.multithreading;

public class MainThread {
    public static void main(String[] args)  {
          MyThread myThread = new MyThread();
          myThread.start();
           synchronized (myThread){
    try {
        System.out.println("print something");
        myThread.wait();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("total is :"+ myThread.total);
}

            }
        }






