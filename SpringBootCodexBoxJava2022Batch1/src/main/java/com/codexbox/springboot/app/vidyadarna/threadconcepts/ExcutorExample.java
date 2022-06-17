package com.codexbox.springboot.app.vidyadarna.threadconcepts;

import java.util.ArrayList;
import java.util.List;

public class ExcutorExample implements Runnable {
    @Override
    public void run() {
//        int t1 = 5;
//        int t2 = 6;
     //   for (int i = 0; i <= 5; i++) {
//            System.out.println("my ExcutorExample values are " +(t1+t2)*i);
            List<Integer> employee = new ArrayList<>();
            employee.add(1);
            employee.add(23);
            employee.add(87);
            employee.add(90);
            employee.add(75);
            employee.add(12);
            employee.add(33);
            employee.add(45);
            employee.add(11);
            employee.add(7);
            employee.add(5);
            for (Integer eid : employee) {


                System.out.println("employee " + eid);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //  System.out.println("my ExcutorExample values are " +(t1+t2)*i);
            }


        }

    }

