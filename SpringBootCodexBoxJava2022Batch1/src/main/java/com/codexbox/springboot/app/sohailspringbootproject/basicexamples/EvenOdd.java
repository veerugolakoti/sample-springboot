package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class EvenOdd {
    static int anInt=0;
    static float aFloat=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number to check Even or Odd Condition : ");
        int number = scanner.nextInt();
        if((number%2)==0){
            System.out.println("The Given Number is Even");
        }
        else {
            System.out.println("The given number is odd :");
        }
    }
}

