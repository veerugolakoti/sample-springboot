package com.codexbox.springboot.app.dinesh202270;





public class FileDemo {
    public static void main(String[] args) {

        MyThread myThread=new MyThread();
        MyThread1 myThread1 = new MyThread1();
myThread1.getPriority();
        myThread.start();
        myThread1.start();

        System.out.println("first ");



        System.out.println(myThread1.getState().name());

        Thread thread =new Thread();

        thread.start();
        }
}
