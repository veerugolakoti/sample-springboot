package com.codexbox.springboot.app.ramdurgaprasad.examples;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        for (int i = 1; i <a ; i++) {
            if(i%2 != 0 && i%3!= 0){
                System.out.println(i);
            }


        }
    }
}
