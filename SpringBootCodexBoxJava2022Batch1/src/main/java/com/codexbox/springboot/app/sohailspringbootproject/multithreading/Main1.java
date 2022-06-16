package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {

//        Thread thread = new Thread(myThread4);
//        thread.start();

        List<Integer> list = new ArrayList<>();
        ExecutorService executorService =Executors.newFixedThreadPool(2);
        list.add(10);
        list.add(20);
        list.add(24);
        list.add(0);
        list.add(270);
        list.add(2);
        for (Integer list1 :list) {
            MyThread4 myThread4 = new MyThread4();
            executorService.execute(myThread4);
        }
        executorService.shutdown();

     /*   Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();
        Runnable runnable3 = new MyRunnable();
        Runnable runnable4 = new MyRunnable();
        Runnable runnable5 = new MyRunnable();


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.execute(runnable3);
        executorService.execute(runnable4);
        executorService.execute(runnable5);
        executorService.shutdown();
    }*/
}}
