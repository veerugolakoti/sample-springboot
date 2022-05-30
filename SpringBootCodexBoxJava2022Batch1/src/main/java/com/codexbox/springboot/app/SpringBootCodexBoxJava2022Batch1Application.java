package com.codexbox.springboot.app;

import com.codexbox.springboot.app.swathi.assesment.EmployeeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
        SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
        //

        List<EmployeeDetails> employees = new ArrayList<>();
        //for ( EmployeeDetails var:employees)
        for (int i = 1; i <= 29; i++) {
            Scanner object = new Scanner(System.in);
            System.out.println("employee name");
            String EmployeeName = object.next();
            System.out.println("employee id");
            String EmployeeId = object.next();
            System.out.println("employee address");
            String employeeAddress = object.next();
            EmployeeDetails employee = new EmployeeDetails(EmployeeName, EmployeeId, employeeAddress);
            employees.add(employee);


        }

        for (int i = 0; i <employees.size(); i++) {
            // System.out.println(Employee.get(i).printEmployeeDetails());
            employees.get(i).printEmployeeDetails();
        }

        employees.remove(employees.get(1));

        for (int i = 0; i <employees.size(); i++) {
            // System.out.println(Employee.get(i).printEmployeeDetails());
            employees.get(i).printEmployeeDetails();
        }

    }}

