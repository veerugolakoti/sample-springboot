package com.codexbox.springboot.app.ramdurgaprasad.threading.synchronization;

public class Synchronization2 extends Thread {
    Normal t;
    Synchronization2(Normal t){
        this.t = t;
    }
    public void run(){
        t.Table(565);
    }
}
