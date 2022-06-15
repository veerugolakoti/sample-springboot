package com.codexbox.springboot.app.TejaAravind.MultiThreading;

public class SyncExample extends Thread {

    private int count = 0;
    synchronized public void getI() {
        count++;
        System.out.println(count);
    }

}
/*class Test {
    private int count = 0;
    public void getI() {
        count++;
        System.out.println(count);
    }

}*/
