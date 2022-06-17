package com.codexbox.springboot.app.ganesh.multithreading;

public class Display1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task one =" + i);
        }


        for (int j = 101; j <= 105; j++) {
            System.out.println("Task two=" + j);
        }

    }
}