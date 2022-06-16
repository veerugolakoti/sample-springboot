package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread4 implements Runnable {



    @Override
    public void run() {
        for (int i =1;i<=5;i++) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
            System.out.println("First Loop : " +i +" :"+simpleDateFormat.format(date) );

        }
          try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted Exception : ");
            }
        for (int i = 1; i <=5; i++) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
            System.out.println("Second Loop : " +i+" :"+simpleDateFormat.format(date));

        }
          try {
                Thread.sleep(10000);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted Exception : ");
            }

        for (int i = 1; i <=5; i++) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
            System.out.println("Third Loop : " +i+" :"+simpleDateFormat.format(date));

        }
    }
}
