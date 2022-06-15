package com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i am run method in runnable interface");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableExample runnable = new RunnableExample();
        MyThreadMethods myThreadMethods = new MyThreadMethods();
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(myThreadMethods);

        thread.start();
//        thread1.notify();
        thread1.start();
        System.out.println("i am running outside run method");
    }
}
