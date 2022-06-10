package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

public class Palindrome {

    public static void main(String args[]) {
        int x=14541;
        int sum=0;
        int temp=x;
        while(x>0){
            int r=x%10;
            sum = sum*10+r;
            x=x/10;
        }
        if(temp==sum) {
            System.out.println("The given number is a palindrome");
        }
            else{
            System.out.println("The given number is not a palindrome");
            }
        }
    }