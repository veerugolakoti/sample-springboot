package com.codexbox.springboot.app.multithreading;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
     myThread.mythreadMethod();
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        }
    }


