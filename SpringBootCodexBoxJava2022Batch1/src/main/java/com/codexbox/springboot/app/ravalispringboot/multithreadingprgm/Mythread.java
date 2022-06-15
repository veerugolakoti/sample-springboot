package com.codexbox.springboot.app.ravalispringboot.multithreadingprgm;

public class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println(" this is my thread");
        System.out.println("my thread state");
       int a = 10;
        int b = 40;
        int sum = a + b;
        System.out.println(sum);

    }

        }




