package com.codexbox.springboot.app.renuProjects.multithreading;

public class Mythread extends Thread{
   public void threading() {
       System.out.println("inside my thread");

    }

    @Override
    public void run() {
        System.out.println("thread  id is  :  "+Thread.currentThread().getId());
    }
}
