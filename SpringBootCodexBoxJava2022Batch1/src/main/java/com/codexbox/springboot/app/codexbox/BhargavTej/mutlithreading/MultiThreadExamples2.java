package com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading;

public  class MultiThreadExamples2 extends Thread{
    @Override
    public synchronized void run() {
        for (int i=0;i<5;i++){
            System.out.println("i am example of main method");
        }
    }
}
