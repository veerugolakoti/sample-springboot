package com.codexbox.springboot.app.HarshaDeepthi;

public class Inturuptthread extends  Thread {
    public void run() {
        /*try {
            Thread.sleep(1000);
            System.out.println("harshu");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted" + e);

        }*/
        for(int i=1; i<=5; i++)
            System.out.println(i);
    }
}