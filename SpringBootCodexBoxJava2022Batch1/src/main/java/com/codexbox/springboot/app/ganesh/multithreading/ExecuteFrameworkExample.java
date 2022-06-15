package com.codexbox.springboot.app.ganesh.multithreading;

public class ExecuteFrameworkExample implements Runnable {





        @Override
        public void run () {
            for (int i = 1; i < 10; i++) {


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("This is executing framework");
            }
        }
    }
