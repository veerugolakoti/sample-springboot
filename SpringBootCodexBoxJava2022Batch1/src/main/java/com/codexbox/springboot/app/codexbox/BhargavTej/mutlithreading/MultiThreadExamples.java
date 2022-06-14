package com.codexbox.springboot.app.codexbox.BhargavTej.mutlithreading;

public  class MultiThreadExamples extends Thread{
   public synchronized void mythread(){
       System.out.println("Welcome to CodexBox");
       System.out.println("Thread No:" + Thread.currentThread().getId());
       System.out.println("Thread Name:" + Thread.currentThread().getName());

       System.out.println("Thread No:" + Thread.currentThread().getId());
       System.out.println("Thread Name:" + Thread.currentThread().getName());

       MultiThreadExamples multiThreadExamples = new MultiThreadExamples();
       System.out.println("mythread id :" + multiThreadExamples.getId());
       System.out.println("mythread Name :" + multiThreadExamples.getName());

       Thread thread = new Thread();
       System.out.println(thread.getId());
       System.out.println(thread.getName());

    }

    @Override
    public void run() {
        System.out.println("Welcome to CodexBox");
        System.out.println("Thread No:" + Thread.currentThread().getId());
        System.out.println("Thread Name:" + Thread.currentThread().getName());

        System.out.println("Thread No:" + Thread.currentThread().getId());
        System.out.println("Thread Name:" + Thread.currentThread().getName());

        MultiThreadExamples multiThreadExamples = new MultiThreadExamples();
        System.out.println("mythread id :" + multiThreadExamples.getId());
        System.out.println("mythread Name :" + multiThreadExamples.getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println("Location hyderabad");

    }
}
