package com.codexbox.springboot.app.dinesh202270;


public class FileDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();



        MyThread1 myThread1 = new MyThread1();

        for(int i=0;i<5;i++) {
            MyThread2 myThread2 = new MyThread2();
            myThread2.start();
        }
     /*   myThread2.setPriority(5);
        myThread.setPriority(5);
        myThread1.setPriority(5);*/


        myThread1.start();
        ///  Thread.sleep(1000);
        myThread.start();


    }
}
