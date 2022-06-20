package com.codexbox.springboot.app.sohailspringbootproject.basicexamples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignIn {
    Scanner scanner = new Scanner (System.in);

    public void signInMethod() {
        try {
            FileWriter writer = new FileWriter("userdata1.txt");
            System.out.println("Enter The personal Details");
            System.out.println("Enter the username :");
            writer.write(scanner.nextLine());
            System.out.println("Enter the password :");
            writer.write(scanner.nextLine());
            writer.flush();
        } catch (IOException e) {
            System.out.println("File Not found Exception Occured : ");
        }
    }
    }

