package com.codexbox.springboot.app.TejaAravind;


import com.codexbox.springboot.app.TejaAravind.MultiThreading.*;
import com.codexbox.springboot.app.TejaAravind.Streams.ReadWriteData;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewMain {

    /*public static void main(String[] args) {
     *//*FileReadingExample fileReadingExample = new FileReadingExample();
        fileReadingExample.inputReading();*//*

        ReadWriteData readWriteData = new ReadWriteData();
        readWriteData.readWriteData();

    }*/

    /*public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(new MyThread());
//        myThread.run();
//        System.out.println(myThread.currentThread().getName());
        System.out.println( thread.getState());
        thread.start();
        System.out.println( thread.getState());
        System.out.println( Thread.currentThread().getState());
        System.out.println("Iam in main method");
        try {
            Thread.sleep(1500);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(thread.getState());
        Thread.sleep(2000);
        System.out.println(thread.getState());

        System.out.println("Iam in main method");



    }*/

    /*public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(thread);
        ThreadExample thread2 = new ThreadExample();
         thread1.setPriority(1);
         thread2.setPriority(10);
         Thread.currentThread().setPriority(1);
        System.out.println("Starting app "+ thread1.getName());
         thread1.start();
        System.out.println("Starting app "+ thread2.getName());
        thread2.start();


    }*/
    /*public static void main(String[] args) {
        ThreadPoolExample tpe1 = new ThreadPoolExample("teja");
        ThreadPoolExample tpe2 = new ThreadPoolExample("sangam");
        ThreadPoolExample tpe3 = new ThreadPoolExample("Ram");
        ThreadPoolExample tpe4 = new ThreadPoolExample("dinesh");


        ExecutorService espool = Executors.newFixedThreadPool(3);

        espool.execute(tpe1);
        espool.execute(tpe2);
        espool.execute(tpe3);
        espool.execute(tpe4);
        espool.shutdown();

    }*/

 public static void main(String[] args) {
    SynchronuousExample se1 = new SynchronuousExample("Hi");
    SynchronuousExample se2 = new SynchronuousExample("Bye");
     se1.setPriority(1);
     se2.setPriority(10);
     Thread thread1 = new Thread(se1) {
         @Override
         public void run() {
             synchronized (se1) {
                 se1.send();
             }
         }
     };
     Thread thread2 = new Thread(se2) {
         @Override
         public void run() {
             synchronized (se2) {
                 se2.send();
             }
         }
     };
     thread1.start();
     thread2.start();

     for (int i = 1; i <= 10; i++) {
         System.out.print(i + "  ");

     }
 }



   /* public static void main(String[] args) {
       final SyncExample se = new SyncExample();
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                synchronized (se){
                    se.getI();

                }
            }
        };


        Thread thread2 = new Thread(){
            @Override
            public void run(){
                synchronized (se){
                    se.getI();

                }
            }
        };
        thread1.start();
        thread2.start();






    }*/
   /*public static void main(String[] args) {
       System.out.println("main method");
       BlocksTest bt = new BlocksTest();
   }*/
}

