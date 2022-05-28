package com.codexbox.springboot.app.assesment3;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1;i<=29;i++){
            System.out.println("Enter the employee" + i + "details: ");
            System.out.println("Enter the employee name: ");
            String name = sc.next();
            System.out.println("Enter the empolyee id: ");
            Integer id = sc.nextInt();
            System.out.println("Enter empolyee address:" );
            String address = sc.next();
            Employee employeeDetails = new Employee(name,id,address);
            empList.add(employeeDetails);
        }
        System.out.println("my total employee  details :" + empList.size());


    }

}


