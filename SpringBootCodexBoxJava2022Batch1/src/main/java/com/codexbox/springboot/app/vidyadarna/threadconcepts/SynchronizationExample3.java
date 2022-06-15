package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class SynchronizationExample3 extends Thread{
    SynchronizExample s;
 void    SynchronizationExample3(SynchronizationExample2 s2) {
     this.s = s;
 }
  public void run(){
     s.printvalues();


    }
}
