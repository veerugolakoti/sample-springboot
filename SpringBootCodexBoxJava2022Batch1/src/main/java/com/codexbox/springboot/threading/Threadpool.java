package com.codexbox.springboot.threading;


public class Threadpool implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i<=5;i++){
            try {
                Thread.sleep(3000);
                System.out.println("the printing thread is :");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }}
    }
}
