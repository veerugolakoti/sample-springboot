package com.codexbox.springboot.app.sohailspringbootproject.main;

import com.codexbox.springboot.app.sohailspringbootproject.basicexamples.Factorial;
import com.codexbox.springboot.app.sohailspringbootproject.fileoperations.InputOutputStreamOperations;

public class MainMethod {
    public static void main(String [] args ){
       /* Factorial factorial = new Factorial();
        factorial.factorialMethod();*/
        InputOutputStreamOperations ioStream = new InputOutputStreamOperations();
        ioStream.ioOperations();
       }
}
