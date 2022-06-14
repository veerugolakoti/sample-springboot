package com.codexbox.springboot.app.ganesh.multithreading;

public class ThreadExample1 extends Thread{
    //public static ThreadExample1 te1;



    int number =0;
     public void run() {
         synchronized (this) {
             for (int i = 0; i < 10; i++) {
                 number =number+i;
                 System.out.println(number);
                 this.notify();
             }

         }
     }


}
