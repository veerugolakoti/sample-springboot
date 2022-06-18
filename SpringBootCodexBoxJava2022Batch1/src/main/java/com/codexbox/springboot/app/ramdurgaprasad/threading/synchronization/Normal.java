package com.codexbox.springboot.app.ramdurgaprasad.threading.synchronization;

public class Normal {
    void Table(int n){
        synchronized (this){
            for (int i = 0; i<10;i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
