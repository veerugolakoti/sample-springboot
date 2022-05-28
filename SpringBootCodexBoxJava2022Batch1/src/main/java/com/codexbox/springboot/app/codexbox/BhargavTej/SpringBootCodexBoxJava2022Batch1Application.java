package com.codexbox.springboot.app.codexbox.BhargavTej;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpringBootCodexBoxJava2022Batch1Application {
    public static void main(String[] args) {
        SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
        List<CodexBoxEmployee> addEmpdetails = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=2 ;i++){
            System.out.println("Enter Employee" + i + "Details");
            System.out.println("Enter name");
            String name = scanner.next();
            System.out.println("Enter Id");
            Integer id = scanner.nextInt();
            System.out.println("Enter Address");
            String address = scanner.next();

            CodexBoxEmployee codexBoxEmployee = new CodexBoxEmployee(name,id, address);
            addEmpdetails.add(codexBoxEmployee);
        }
        for (CodexBoxEmployee cx:addEmpdetails) {
            cx.display();
        }
        System.out.println("My total employee" + addEmpdetails.size());
    }
}
