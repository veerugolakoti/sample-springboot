package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class Table {
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Table Number : ");
        int number =scanner.nextInt() ;
        for (int i = 1; i <=number; i++) {
            int a =i*number;
            System.out.println(a);
        }
    }
}
