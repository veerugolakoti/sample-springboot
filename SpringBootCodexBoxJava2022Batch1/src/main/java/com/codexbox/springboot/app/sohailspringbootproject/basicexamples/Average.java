package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.util.Scanner;

public class Average {
    public void averageMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total Numbers for Average ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double avg = (a+b)/2 ;
        System.out.println("The Average of 2 numbers is : ");

        System.out.println(avg);
    }

}
