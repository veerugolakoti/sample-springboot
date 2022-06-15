package com.codexbox.springboot.app.Veeru.mutlitthreading;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Imside My thread run method");
    }
}
