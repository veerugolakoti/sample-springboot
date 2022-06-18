package com.codexbox.springboot.app.ramdurgaprasad.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolMain {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);


        for (int i = 0; i < 7; i++) {
            Runnable poolthread = new PoolThreading("" +i);
            service.execute(poolthread);

        }
        service.shutdown();
        while(!service.isTerminated()){}
            System.out.println("is terminated");


    }
}
