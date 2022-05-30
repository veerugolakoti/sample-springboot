package com.codexbox.springboot.app.jhansiproject.assesment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<EmployeeDetails> list = new ArrayList<>();
        for(int i = 1; i <= 29; i++) {
            System.out.println("Enter the " + i + " details");
            System.out.print("Enter the employee name: ");
            String name =  input.next();
            System.out.print("Enter the employee id: ");
            int id =  input.nextInt();
            System.out.print("Enter the address: ");
            String address = input.next();

            EmployeeDetails emp = new EmployeeDetails(name, id, address);
            list.add(emp);
        }

        for(EmployeeDetails empList: list) {
            System.out.println(empList.getName() + " " + empList.getId() + " " + empList.getAddress());
        }
    }


        }


