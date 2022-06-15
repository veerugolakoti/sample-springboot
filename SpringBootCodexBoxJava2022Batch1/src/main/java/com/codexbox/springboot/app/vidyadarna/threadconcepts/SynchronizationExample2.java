package com.codexbox.springboot.app.vidyadarna.threadconcepts;

import com.codexbox.springboot.app.vidyadarna.fileInputOutput.SequenceExample;

public class SynchronizationExample2 extends Thread{


    @Override
    public synchronized void  run() {
     int n = 2;
     for (int i =1;i<=5; i++){
         System.out.println(n*i);
         System.out.println("my SynchronizedExample1 state " );
     }

    }
}