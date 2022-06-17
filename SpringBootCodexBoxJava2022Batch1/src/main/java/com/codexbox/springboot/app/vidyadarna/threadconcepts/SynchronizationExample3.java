package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class SynchronizationExample3 extends Thread{

  public void run(){
      int a = 2;
      int b = 4;
      for (int i = 1; i <=4 ; i++){
          System.out.println("to print the values of " +(a+b)*i);
          System.out.println("my Synchronizationexample3 state "+SynchronizationExample3.currentThread().getState());
          try {
              SynchronizationExample3.sleep(100l);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
         // System.out.println("to print the values of " +(a+b)*i);
      }



    }
}
