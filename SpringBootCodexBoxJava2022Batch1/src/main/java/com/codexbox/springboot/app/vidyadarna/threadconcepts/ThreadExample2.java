package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class ThreadExample2 extends Thread {


    @Override
    public void run() {
        int n = 2;
        int m = 5;
        int c = m*n;
        System.out.println("my multification of two values are :  " +c);
        System.out.println("my threadExample2 state now  : " +ThreadExample2.currentThread().getState());
        System.out.println("now my first programme completed " );

        int a= 10;
        int b = 5;
        int g = 22;
        int sum = a+b+g;
        System.out.println("my sum value is " +sum);
        System.out.println("my thread state :   "+ThreadExample2.currentThread().getState());
        System.out.println("my second programme completed ");
        try {
            ThreadExample2.sleep(1000l);
          //  System.out.println("i complete my thread");
        } catch (InterruptedException e) {
            System.out.println("waiting some time");
        }
        System.out.println(" my ThreadExample2 programmes is completed");
        }
    }

