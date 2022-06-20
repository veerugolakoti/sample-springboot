package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class PrimeNumber {
    static int count =1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to Check whether it is prime or not : ");
        int number =scanner.nextInt();
        for (int i = 1; i <number ; i++) {
            if (number % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println("The number is prime :");
            } else {
                System.out.println("the number is not prime :");
            }
        }
        }


