package com.codexbox.springboot.app.multithreading;

public class Main {
    public static void main(String args[]){
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t2.start();
        t1.start();

    }


}







