package com.codexbox.springboot.app.ramdurgaprasad.threading.syncronizationannonymous;

public class Start {
    public void Starter(String message){
        System.out.println("the message entered:" +message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
