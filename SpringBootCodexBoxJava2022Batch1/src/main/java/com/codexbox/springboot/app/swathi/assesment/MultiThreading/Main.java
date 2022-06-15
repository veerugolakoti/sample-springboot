package com.codexbox.springboot.app.swathi.assesment.MultiThreading;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
/*

            MyThread myThread=new MyThread();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });

            MyThread MyThread1 =new MyThread();
            Thread T2=new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });
            MyThread1.method();
            MyThread1.method1();

*/
        ThreadMethods threadMethods=new ThreadMethods();
        threadMethods.run();
        //System.out.println();
        threadMethods.start();
       System.out.println(threadMethods.getState());




    }

}
