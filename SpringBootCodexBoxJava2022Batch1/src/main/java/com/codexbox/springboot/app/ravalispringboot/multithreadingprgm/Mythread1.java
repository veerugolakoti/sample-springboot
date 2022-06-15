package com.codexbox.springboot.app.ravalispringboot.multithreadingprgm;

public class Mythread1 implements Runnable {


    public Mythread1(int a) {
        int number = a;
    }

    @Override
    public void run() {
        System.out.println(" it is run method");
    }


    public void start() {
        System.out.println("it is thread start");
    }
}

