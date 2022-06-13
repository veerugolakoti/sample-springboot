package com.codexbox.springboot.app.vamshi;

import com.codexbox.springboot.app.vamshi.multithreading.MyThreadSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainSpringBootApi {
    public static void main(String[] args) {
        MyThreadSample myThreadSample = new MyThreadSample();
        int a = 11, b=44, c=a*b ;
        System.out.println("total >>>"+c);

        myThreadSample.run();
        myThreadSample.start();

        myThreadSample.testThread();
        System.out.println("check3 "+myThreadSample.getId());
        System.out.println(myThreadSample.getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println("check4 "+thread.currentThread().getName());

        MyThreadSample myThreadSample1 = new MyThreadSample();
        System.out.println("check5  "+myThreadSample1.getId());
        System.out.println(myThreadSample1.getName());



    }
}
