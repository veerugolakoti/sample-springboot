package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class SynchronizExample extends Thread{
    void printvalues() {
        int n = 5;

        for (int i = 1; i <= 5 ; i++){
            System.out.println("my state is now : " +Thread.currentThread().getState());
            System.out.println("my print values are : " +(n*i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}