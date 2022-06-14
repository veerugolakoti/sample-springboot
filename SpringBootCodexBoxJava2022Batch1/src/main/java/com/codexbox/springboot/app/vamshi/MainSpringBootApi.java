package com.codexbox.springboot.app.vamshi;

import com.codexbox.springboot.app.vamshi.multithreading.MyRunnableSample;
import com.codexbox.springboot.app.vamshi.multithreading.MyThreadSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainSpringBootApi {
    public static void main(String[] args) {
        MyThreadSample myThreadSample = new MyThreadSample();
        System.out.println(myThreadSample.getState());
        myThreadSample.start();
       // System.out.println(myThreadSample.getState());
        try {
            myThreadSample.join();
            System.out.println("check joining ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // System.out.println(myThreadSample.getState());
        try {
            Thread.sleep(10000);
            System.out.println("check : sleep activated");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(myThreadSample.getState());




      /*
        //runnable
        MyRunnableSample myRunnableSample = new MyRunnableSample();
        myRunnableSample.run();
        try {
            Thread.sleep(1000l);
            // myRunnableSample.notify();
            // myRunnableSample.wait();
            System.out.println("check sleep works ");
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
        }*/





        /*MyThreadSample myThreadSample = new MyThreadSample();
        int a = 11, b=44, c=a*b ;
        System.out.println("total >>>"+c);

        myThreadSample.start();

        myThreadSample.testThread();
        System.out.println("check3 "+myThreadSample.getId());
        System.out.println(myThreadSample.getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println("check4 "+thread.currentThread().getName());

        MyThreadSample myThreadSample1 = new MyThreadSample();
        System.out.println("check5  "+myThreadSample1.getId());
        System.out.println(myThreadSample1.getName());*/



    }
}
