package com.codexbox.springboot.threading;

public class ThreadExample extends Thread {

    public void run() {
        System.out.println("the main thread name is :" +currentThread().getId());
        System.out.println("the main thread id is :" +currentThread().getName());

   }
}
