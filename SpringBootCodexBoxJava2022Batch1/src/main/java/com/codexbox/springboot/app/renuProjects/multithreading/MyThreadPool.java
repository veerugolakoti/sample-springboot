package com.codexbox.springboot.app.renuProjects.multithreading;

public class MyThreadPool implements Runnable{
    private String message;
    public void MyThreadpool(String s) {
        this.message=s;
        }
    synchronized  public void run(){
            System.out.println(Thread.currentThread().getName()+message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
}
