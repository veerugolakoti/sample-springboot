package com.codexbox.springboot.app.vamshi.multithreading;

public class MyRunnableSample implements Runnable{
  /*  public synchronized static void kalyan(){
        System.out.println("this is my scync ");

    }*/
  /*  public MyRunnableSample(MyThreadSample myThreadSample) {
    }*/

    @Override
    public synchronized void run() {

            for(int i=1; i<=5; i++) {
                System.out.println(" check " + i);
            }

        System.out.println("check : runnable success");
        System.out.println("priority : "+Thread.currentThread().getPriority());
    }
}
