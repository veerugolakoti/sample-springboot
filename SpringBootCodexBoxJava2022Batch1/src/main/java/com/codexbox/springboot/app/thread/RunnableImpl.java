package com.codexbox.springboot.app.thread;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
       // for (int i = 0; i<=5; i++) {


            System.out.println("This is executor framework in java");
        //}
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
