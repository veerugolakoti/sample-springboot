package com.codexbox.springboot.app.renuProjects.multithreading;

public class Table {

    synchronized public void mytable(int n){

        for (int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(n*i);
        }

    }

}
