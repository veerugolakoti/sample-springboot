package com.codexbox.springboot.app.vidyadarna.threadconcepts;

public class PriorityExample2 extends Thread{
    @Override
    public void run() {
        int a = 25;
        int b = 50;
        int sub = b-a;
        System.out.println("my Priority2Example sub is" +sub);
        System.out.println("my priority2Example state is : "+ PriorityExample2.currentThread().getState() );
        try {
            PriorityExample2.sleep(111l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("my Priority2Example programme completed");
    }
}
