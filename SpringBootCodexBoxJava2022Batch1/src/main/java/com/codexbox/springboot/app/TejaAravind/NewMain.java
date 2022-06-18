package com.codexbox.springboot.app.TejaAravind;


import com.codexbox.springboot.app.TejaAravind.MultiThreading.*;
import com.codexbox.springboot.app.TejaAravind.Streams.ReadWriteData;
import com.codexbox.springboot.app.TejaAravind.jdbc.Employee;
import com.codexbox.springboot.app.TejaAravind.jdbc.JdbcExample;

import java.util.ArrayList;
import java.util.List;
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



        List<String> list = new ArrayList<>();
        ExecutorService espool = Executors.newFixedThreadPool(2);
        list.add("teja");
        list.add("sangam");
        list.add("Ram");
        list.add("dinesh");
        for (String item : list) {
            ThreadPoolExample tpe = new ThreadPoolExample(item);
            espool.execute(tpe);
        }
        espool.shutdown();

    }*/

/* public static void main(String[] args) {
    SynchronuousExample se1 = new SynchronuousExample();

    Demo1 demo1 = new Demo1(se1);
    Demo2 demo2 =new Demo2(se1);
    Demo1 demo3 = new Demo1(se1);
     demo1.setPriority(1);
     demo2.setPriority(10);


     demo1.start();
     demo2.start();
     demo3.start();

     for (int i = 1; i <= 10; i++) {
         System.out.print(i + "  ");

     }
 }*/



   /*public static void main(String[] args) {
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


    public static void main(String[] args) {
        JdbcExample jdbc = new JdbcExample();
        List<Employee> empList = jdbc.getDetails();
        for (Employee emp : empList) {
            System.out.println(emp.getEmpId());
            System.out.println(emp.getEmpName());
            System.out.println(emp.getEmpAddress());
            System.out.println(emp.getEmpSalary());
            System.out.println(emp.getPhoneNo());
        }

    }
}

