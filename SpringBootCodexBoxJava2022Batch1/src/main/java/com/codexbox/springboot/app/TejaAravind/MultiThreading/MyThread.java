package com.codexbox.springboot.app.TejaAravind.MultiThreading;

import com.codexbox.springboot.app.sohailspringbootproject.interfaceconcept.Car;

import java.awt.*;
import java.util.StringTokenizer;

import static java.lang.Thread.sleep;

public class MyThread implements Runnable{

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            int n = (i <= 3) ? 2 * i - 1 : 11 - 2 * i;
            int m = (i <= 3) ? 3 - i : i - 3;
            for (int j = 1; j <= m; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");

            }
            System.out.println();

        }
        System.out.println("Iam inside mythread");
        System.out.println(Thread.currentThread().getState());



//            Thread.sleep(2000);

//            Thread.yield();
            System.out.println("Iam inside mythread");


    }
}
