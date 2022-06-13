package com.codexbox.springboot.app.mounika.swapnumbers;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

public class ExampleSwap {

    public static void main(String[] args) {

        int a;
        int b;
        int y;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the first element a and b :");
        a= s1.nextInt();
        b= s1.nextInt();

        System.out.println("before swapping : "+a+" "+b);

        y=a;
        a=b;
        b=y;

        System.out.println("after swapping :"+a+" "+b);
        System.out.println();


         int n1=20, n2=30,sum;
         sum=n1+n2;
        System.out.println("enter sum of elements :" + sum);

        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }

            System.out.println(i);
        }
    }
}
