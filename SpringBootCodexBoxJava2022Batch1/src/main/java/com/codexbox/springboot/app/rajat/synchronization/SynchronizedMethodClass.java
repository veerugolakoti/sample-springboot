package com.codexbox.springboot.app.rajat.synchronization;

public class SynchronizedMethodClass {
    public synchronized void printNumber(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        }

    }
}
