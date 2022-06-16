package com.codexbox.springboot.app.multithreading;

public class Table {
    synchronized void printTable(int n){
        for (int i = 1;i<=5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
