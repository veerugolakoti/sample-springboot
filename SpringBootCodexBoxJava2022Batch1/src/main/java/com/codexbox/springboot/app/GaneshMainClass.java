package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.multithreading.ThreadExample;
import com.codexbox.springboot.app.ganesh.multithreading.ThreadExample1;

public class GaneshMainClass {
    public static void main(String[] args) {

      /*  ThreadExample example = new ThreadExample();

synchronized (example){
    try {
        example.wait(10000);
        System.out.println("The thread is in wait state");
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    Thread.sleep(20000);
    System.out.println("The thread is sleep method");

}

        example.start();
        System.out.println(example.getState());
        System.out.println(example.getId());
        System.out.println( example.getName());
        System.out.println(example.getState());

    }
}
*/

   // ******************************//

        ThreadExample1 te1 =new ThreadExample1();

        System.out.println( te1.getState());
        te1.start();
        System.out.println(te1.getState());
synchronized (te1){
    System.out.println("main thread");
    try {
        te1.wait(3000);
        System.out.println("After the main thread");
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
        System.out.println(te1.getState());
    }

}
