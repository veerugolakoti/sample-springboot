package com.codexbox.springboot.app.renuProjects.multithreading;

public class JoinThreadEx extends Thread{
    public void run(){
        for(int i=0; i>2; i++){
            System.out.println("thread: "+i);


        }
    }
}
