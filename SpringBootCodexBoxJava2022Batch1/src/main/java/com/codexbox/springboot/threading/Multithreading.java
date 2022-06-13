package com.codexbox.springboot.threading;

public class Multithreading extends Thread{
    public void run() {
try{
    System.out.println("the thread : " + Thread.currentThread().getId() + "thread running ");
        } catch (Exception e){
            System.out.println("exception is running :");
        }

    }}
