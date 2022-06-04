package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dinesh202270.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		LinkedListExample example = new LinkedListExample();
//		System.out.println(example.loadMyList());
        Scanner sc = new Scanner(System.in);
        Stack<Employee> employeeList = new Stack<>();

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println("Plz enter employee " + (i + 1) + " Name : ");
            String name = input.nextLine();
            System.out.println("Plz enter employee " + (i + 1) + " Address : ");
            String address = input.nextLine();
            System.out.println("Plz enter employee " + (i + 1) + " ContactNo : ");
            int id = input.nextInt();
            System.out.println("()()()()()()()()()()()()()");
            Employee employee = new Employee(name, address, id);
            employeeList.add(employee);
        }

        for (int i = 0; i < 3; i++) {
            //  if(employeeList.)
            employeeList.get(i).printData();
        }

        System.out.println("enter who is absent");
        String abs = sc.nextLine();

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getName().equals(abs)) {
                // System.out.println(abs +" is absent ");

                System.out.println("Plz enter new employee Name : ");
                String name = sc.nextLine();
                System.out.println("Plz enter new employee  Address : ");
                String address = sc.nextLine();
                System.out.println("Plz enter new employee ContactNo : ");
                int id = sc.nextInt();
                Employee emp = new Employee(name, address, id);
                // emp.printData();

                employeeList.set(i, emp);
            }
        }
        for (int i = 0; i < 3; i++) {
            //  if(employeeList.)
            employeeList.get(i).printData();
        }
    }

}
