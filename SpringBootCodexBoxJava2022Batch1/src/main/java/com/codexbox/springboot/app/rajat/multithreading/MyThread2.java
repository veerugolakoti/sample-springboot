package com.codexbox.springboot.app.rajat.multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run() {
     /*   for (int i = 0; i <=1 ; i++){
            for (int j = 0; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());*/
        System.out.println("MyThread2 Priority:"+Thread.currentThread().getPriority());
    }
}
