package com.codexbox.springboot.main;

import com.codexbox.springboot.threading.SynchronisedThreadpool;
import com.codexbox.springboot.threading.Threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        //        int n = 8;
//        for(int i=0;i<n;i++){
//            Multithreading multithreading = new Multithreading();
//            try {
//                System.out.println(multithreading.isAlive());
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
       // for (int i = 1; i <=2;i++) {
            Threadpool threadpool = new Threadpool();
            ExecutorService es = Executors.newFixedThreadPool(2);
            es.execute(threadpool);
            es.execute(threadpool);
            es.shutdown();
        }
    }
//}//
