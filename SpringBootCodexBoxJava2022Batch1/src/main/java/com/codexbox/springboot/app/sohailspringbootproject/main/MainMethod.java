package com.codexbox.springboot.app.sohailspringbootproject.main;

import com.codexbox.springboot.app.sohailspringbootproject.fileoperations.CountFIle;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.MyThread;

public class MainMethod {
    public static void main(String [] args ){
       /* Factorial factorial = new Factorial();
        factorial.factorialMethod();*/
//        InputOutputStreamOperations ioStream = new InputOutputStreamOperations();
//        ioStream.ioOperations();
      /*  Combine2Files combine2Files = new Combine2Files();
        combine2Files.combineFiles();*/
      /*  Average average = new Average();
        average.averageMethod();*/
     /*   AverageExample averageExample = new AverageExample();
        averageExample.averageMethod();*/
      /*  CarDetails carDetails = new CarDetails();
        carDetails.ford();
        carDetails.tata();

*/
        /*CreateFile createFile = new CreateFile();
        createFile.createFileMethod();*/

        MyThread myThread = new MyThread();
        myThread.run();

       /* CountFIle countFIle = new CountFIle();
        countFIle.countMethod();*/

    }
}
