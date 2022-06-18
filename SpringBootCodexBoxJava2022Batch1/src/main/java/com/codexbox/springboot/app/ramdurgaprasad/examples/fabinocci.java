package com.codexbox.springboot.app.ramdurgaprasad.examples;

import java.util.Scanner;

public class fabinocci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int  b = scanner.nextInt();
        int count =  scanner.nextInt();
        int c;
        for (int i = 2; i <count ; i++) {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
