package com.codexbox.springboot.app.abhilash.multithreading;

public class ThreadPoolExample implements Runnable{
    private String s;

    public ThreadPoolExample(String s) {
        this.s = s;
    }
    @Override
    public void run() {
        for(int i = 0;i<5 ;i++){
            if(i==1) {
                System.out.println("ThreadPoolExample " + i + "executed");
            }
        }

    }
}
