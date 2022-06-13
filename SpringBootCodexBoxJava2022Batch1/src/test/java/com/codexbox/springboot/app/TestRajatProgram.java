package com.codexbox.springboot.app;

import com.codexbox.springboot.app.rajat.multithreading.MyThreadOne;
import org.junit.jupiter.api.Test;

public class TestRajatProgram {
    @Test
    public void testMyThread() {

            int a = 10,b = 20,c=a+b;
//         c= a+b;
        System.out.println(c);


        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.run();
        myThreadOne.start();
        try {
            myThreadOne.start();
        }catch (IllegalThreadStateException i){
            System.out.println("yOU CAN NOT CALL TWO START METHOD AT A TIME");
        }
        System.out.println(myThreadOne.getId());
        System.out.println(myThreadOne.getName());

        MyThreadOne myThreadOne1 = new MyThreadOne();
        System.out.println(myThreadOne1.getId());
        System.out.println(myThreadOne1.getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());

    }

}
