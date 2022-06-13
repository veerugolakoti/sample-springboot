package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class AverageExample {
    public static void main(String[] args) {

            double y;
            double z = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the total numbers count for average ");
            double x = scanner.nextDouble();
            System.out.println("Enter The values  for average : ");
            for (int i = 0; i < x; i++) {
                System.out.println("Enter the " + (i + 1) + "Value : ");
                y = scanner.nextDouble();
                z += (y / x);
            }
            System.out.print("The average: " + z);
        }
    }
