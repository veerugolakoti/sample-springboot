package com.codexbox.springboot.app.mounika.multithreading;

public class Threading  extends Thread{

    public void run() {
        System.out.println(" Thread elements is ");
    }

    public int sum()
    {
        int a=10;
        int b=0;

        System.out.println("sum method");
        return a/b;
    }


    }


