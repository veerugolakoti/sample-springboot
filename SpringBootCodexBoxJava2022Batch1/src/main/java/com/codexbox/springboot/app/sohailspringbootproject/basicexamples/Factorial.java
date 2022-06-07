package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class Factorial {
    public void factorialMethod(){
        Integer x;
        Integer fact=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of factorial you want : ");
        x=scanner.nextInt();
        for(int i = 1; i<=x;i++) {
           fact=fact*i ;
        }
        System.out.println("The Factorial of a number" +x +"is");
            System.out.println(fact);
        }

    }


