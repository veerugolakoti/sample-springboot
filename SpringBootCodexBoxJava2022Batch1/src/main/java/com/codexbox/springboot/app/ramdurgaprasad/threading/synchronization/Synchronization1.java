package com.codexbox.springboot.app.ramdurgaprasad.threading.synchronization;

public class Synchronization1 extends Thread{
    Normal t ;
    Synchronization1(Normal t){
        this.t=t;
    }
public void run(){
        t.Table(23);
}
}
