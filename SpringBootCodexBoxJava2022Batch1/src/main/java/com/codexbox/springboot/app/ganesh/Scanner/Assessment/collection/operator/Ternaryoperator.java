package com.codexbox.springboot.app.ganesh.Scanner.Assessment.collection.operator;

public class Ternaryoperator {
    int number1 = 454, number2 = 963, result;

    public void calulateternaryoperator() {


        result =(number1>number2)?(number1+number2):(number1-number2);
        System.out.println(result);
    }
}