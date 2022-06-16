package com.codexbox.springboot.app.TejaAravind.MultiThreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPoolExample implements Runnable {
    String name;

    public ThreadPoolExample(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(name + " is started working " + sdf.format(date));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println(name + " is done working "+ sdf.format(date));

    }
}
