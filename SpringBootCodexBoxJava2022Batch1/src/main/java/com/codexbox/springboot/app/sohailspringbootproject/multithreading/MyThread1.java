package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread1 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            System.out.println("I am in my Class MyThread1 and state is :" + Thread.currentThread().getState());
            System.out.println(dateFormat.format(date));
        }
        try{
            Thread.sleep(10000l);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception ");
        }
        for (Integer i=0;i<=5 ;i++){
            System.out.println("I am in my Class Thread " +Thread.currentThread().getState());
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            System.out.println(dateFormat.format(date));
        }
        System.out.println(Thread.currentThread().getState());



    }
}
