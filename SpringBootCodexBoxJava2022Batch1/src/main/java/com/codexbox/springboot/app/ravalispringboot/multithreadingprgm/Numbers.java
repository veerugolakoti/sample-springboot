package com.codexbox.springboot.app.ravalispringboot.multithreadingprgm;

public class Numbers {
   synchronized public void numbers(int n) {
       for (int i = 1; i < 6; i++) {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(n+i);
       }
   }
}
