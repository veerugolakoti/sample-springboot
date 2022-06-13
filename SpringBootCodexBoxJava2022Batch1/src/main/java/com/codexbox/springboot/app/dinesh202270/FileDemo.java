package com.codexbox.springboot.app.dinesh202270;


import java.io.Console;
public class FileDemo {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter password: ");
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);//converting char array into string
        System.out.println("Password is: "+pass);

        Console ca=System.console();
            System.out.println("Enter your name: ");
            String n=ca.readLine();
            System.out.println("Welcome "+n);
        }

    }
