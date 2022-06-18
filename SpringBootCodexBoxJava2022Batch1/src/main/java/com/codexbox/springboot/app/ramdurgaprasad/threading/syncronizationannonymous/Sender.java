package com.codexbox.springboot.app.ramdurgaprasad.threading.syncronizationannonymous;

public class Sender extends Thread{
    private String message;
    Start st;
    Sender(String message,Start start){
        this.st = start;
        this.message = message;
    }
    public void run(){
        synchronized (st){
            st.Starter(message);
        }

    }
}
