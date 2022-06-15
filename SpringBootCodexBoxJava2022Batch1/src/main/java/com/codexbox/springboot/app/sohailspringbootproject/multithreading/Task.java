package com.codexbox.springboot.app.sohailspringbootproject.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task extends Thread{
    private String name ;
    public  Task (String s){
        name = s;

    }
    @Override
    public void run() {
        try{
        for (int i = 0; i <3; i++) {
            if (i == 0) {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("The Initialisation Time is " +name +"="+ dateFormat.format(date));
            } else {
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println("The Executed Time is "+name +"=" +  dateFormat.format(date));

            }
            Thread.sleep(1000);

        }
            System.out.println(name +" is completed");
        }
        catch (InterruptedException e){
            System.out.println("It is under Interrupted Exception");
            }

        }

    }

