package com.codexbox.springboot.app.HarshaDeepthi;

public class Mythread extends Thread{
      public void  mythread(){
          System.out.println("mythread class is there ");
      }

    @Override
    public void run() {
        System.out.println("my thread id is  " +Thread.currentThread().getId() );
    }
}
