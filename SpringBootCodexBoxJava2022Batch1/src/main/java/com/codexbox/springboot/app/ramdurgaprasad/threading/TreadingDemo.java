package com.codexbox.springboot.app.ramdurgaprasad.threading;

public class TreadingDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getState());
        System.out.println("i am in the main method");

        MyThread myThread = new MyThread();
       myThread.method();
       myThread.start();
     

        System.out.println(MyThread.currentThread().getState());
        MyThread2 myThread2 = new MyThread2() ;
        Thread tread = new Thread(myThread2);
        tread.getState();
        tread.setPriority(3);

        System.out.println(MyThread.currentThread().getState());


        System.out.println(Thread.currentThread().getState());

        System.out.println("iam in the last of the main method");
        myThread.getPriority();
       try {
            MyThread.sleep(1000);
           System.out.println(myThread.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
