package com.codexbox.springboot.app.ramdurgaprasad.threading.staticsyncronization;

public class StaticSynchronization2 extends Thread {
   public void run(){
       StaticSynchronized.table(5);

    }
}
