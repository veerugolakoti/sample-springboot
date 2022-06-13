package com.codexbox.springboot.app.vamshi.multithreading;

public class MyThreadSample extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("check number >>>"+i);
        }
            System.out.println("check1 "+Thread.currentThread().getId());
    }

    public void testThread(){
        System.out.println("check2 "+Thread.currentThread().getName());
    }
}
