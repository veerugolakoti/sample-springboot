package com.codexbox.springboot.app.Veeru.mutlitthreading;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        int sum =  10 + 30;
        System.out.println("Sum is : " + sum);
        System.out.println("Name of my thread2 is : " + Thread.currentThread().getName());
        System.out.println("Id of my thread2 is : " + Thread.currentThread().getId());
        //try {
           // Thread.sleep(10000l);
            //System.out.println(Thread.().getState());
       /* /} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
