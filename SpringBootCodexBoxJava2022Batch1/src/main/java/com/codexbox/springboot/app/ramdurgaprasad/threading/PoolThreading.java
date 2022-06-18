package com.codexbox.springboot.app.ramdurgaprasad.threading;

public class PoolThreading implements Runnable{
    private String name;
    public PoolThreading(String s){
        this.name=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " message "+ name);
        method();
        System.out.println(Thread.currentThread().getState()+ "   is ended");
        System.out.println("end of the "+name);
    }
    public void method(){
        try {
            Thread.sleep(350);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

