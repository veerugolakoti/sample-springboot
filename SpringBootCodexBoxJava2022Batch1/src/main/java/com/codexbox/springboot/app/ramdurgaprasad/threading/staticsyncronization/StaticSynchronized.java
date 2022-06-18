package com.codexbox.springboot.app.ramdurgaprasad.threading.staticsyncronization;

public class StaticSynchronized {
    synchronized static void table(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n * i);

        }
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }
}
