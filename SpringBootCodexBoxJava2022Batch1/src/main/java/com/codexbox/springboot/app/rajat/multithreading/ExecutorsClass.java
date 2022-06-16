package com.codexbox.springboot.app.rajat.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ExecutorsClass implements Callable {

     public void  run() {
        for (int i = 1 ; i <= 10; i++){
            System.out.println("Employee Id ::"+i);
        }
       /* for (int j = 1 ; j <= 10; j++){
            System.out.println("Employee Id ::"+j);
        }
        for (int k = 1 ; k <= 10; k++){
            System.out.println("Employee Id ::"+k);
        }*/
        List<String> employeeName = new ArrayList<>();
        employeeName.add("Rajat");
        employeeName.add("Vamshi");
        employeeName.add("Shoial");
        employeeName.add("Shiva");
        employeeName.add("Lipu");
        employeeName.add("Chandan");
        employeeName.add("Bipin");
        employeeName.add("Kumar");


    }

    @Override
    public Object call() throws Exception {
        List<String> employeeName = new ArrayList<>();
        employeeName.add("Rajat");
        employeeName.add("Vamshi");
        employeeName.add("Shoial");
        employeeName.add("Shiva");
        employeeName.add("Lipu");
        employeeName.add("Chandan");
        employeeName.add("Bipin");
        employeeName.add("Kumar");
        for (String name:employeeName) {
            System.out.println(name);
        }
        return null;
    }
}
