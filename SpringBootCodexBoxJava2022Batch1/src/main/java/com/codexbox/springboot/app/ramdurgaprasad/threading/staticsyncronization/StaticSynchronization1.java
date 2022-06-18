package com.codexbox.springboot.app.ramdurgaprasad.threading.staticsyncronization;

public class StaticSynchronization1 extends Thread{
    public void run(){
        StaticSynchronized.table(3);
    }

}
