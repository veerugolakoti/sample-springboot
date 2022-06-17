package com.codexbox.springboot.app.thread;

public class RunnableExample implements Runnable{
    public void run(){
        for(int i= 0;i<=5;i++)
        System.out.println("The no. of threads:" +i);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread completed execution");
    }


}
