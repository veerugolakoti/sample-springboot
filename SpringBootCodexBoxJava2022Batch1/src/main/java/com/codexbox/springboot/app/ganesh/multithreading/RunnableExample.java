package com.codexbox.springboot.app.ganesh.multithreading;

public class RunnableExample implements Runnable {
    int counter=0;
    public void run(){

        counter++;

        System.out.println("Implements Runnable="+counter);

    }













}
