package com.codexbox.springboot.app.ramdurgaprasad.threading.staticsyncronization;

public class Maih {
    public static void main(String[] args) {
        StaticSynchronization1 synchronization1= new StaticSynchronization1();
        StaticSynchronization2 staticSynchronization2= new StaticSynchronization2();
        System.out.println( synchronization1.getState());
        synchronization1.start();
        staticSynchronization2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(staticSynchronization2.getState());
    }
}
