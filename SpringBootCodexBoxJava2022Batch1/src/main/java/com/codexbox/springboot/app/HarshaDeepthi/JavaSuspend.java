package com.codexbox.springboot.app.HarshaDeepthi;

public class JavaSuspend  extends  Thread{
    public void run(){
        for(int i=1;i<10;i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }

    }
}
