package com.codexbox.springboot.app.sohailspringbootproject.main;

import com.codexbox.springboot.app.sohailspringbootproject.basicexamples.Average;
import com.codexbox.springboot.app.sohailspringbootproject.basicexamples.AverageExample;
import com.codexbox.springboot.app.sohailspringbootproject.basicexamples.Factorial;
import com.codexbox.springboot.app.sohailspringbootproject.fileoperations.Combine2Files;
import com.codexbox.springboot.app.sohailspringbootproject.fileoperations.InputOutputStreamOperations;

public class MainMethod {
    public static void main(String [] args ){
       /* Factorial factorial = new Factorial();
        factorial.factorialMethod();*/
        InputOutputStreamOperations ioStream = new InputOutputStreamOperations();
        ioStream.ioOperations();
      /*  Combine2Files combine2Files = new Combine2Files();
        combine2Files.combineFiles();*/
      /*  Average average = new Average();
        average.averageMethod();*/
     /*   AverageExample averageExample = new AverageExample();
        averageExample.averageMethod();*/
       }
}
