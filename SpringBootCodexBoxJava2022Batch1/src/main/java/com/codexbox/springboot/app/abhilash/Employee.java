package com.codexbox.springboot.app.abhilash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

   private Integer employee_id ;
    private String employee_name;
    private String address ;
    public Employee() {
    }
    public Employee(Integer employee_id, String employee_name, String address) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.address = address;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getAddress() {
        return address;
    }

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details:");
        System.out.println("enter employee id");
        employee_id = sc.nextInt();
        System.out.println("enter employee name");
        employee_name = sc.next();
        System.out.println("enter the address ");
        address = sc.next();
    }
    public void showDetails() {
        System.out.println("employee details:");
        System.out.println("employee id is :" + getEmployee_id() );
        System.out.println("employee name is: " + getEmployee_name());
        System.out.println("employee address is: " + getAddress());
    }

}
