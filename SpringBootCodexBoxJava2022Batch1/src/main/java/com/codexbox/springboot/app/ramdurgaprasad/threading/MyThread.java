package com.codexbox.springboot.app.ramdurgaprasad.threading;

public class MyThread extends Thread {
    public void method(){

    int n =5;

        for (int i = 0; i < 2*n; i++) {
        int total=i>n?2*n-i:i;
       int space =n-total;
        for (int j = 0; j < space; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < total; k++) {
            System.out.print(i+" ");

        }
      System.out.println();

    }
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
    }


}
