package com.codexbox.springboot.app.dhivya.threads;

public class TestSynchronization2 {
    public static void main(String[] args) {


        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
