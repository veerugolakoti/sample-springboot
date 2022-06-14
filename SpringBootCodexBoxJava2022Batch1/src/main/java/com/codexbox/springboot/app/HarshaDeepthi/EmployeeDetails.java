package com.codexbox.springboot.app.HarshaDeepthi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {


    private int employeeId;
    private String employeeName;
    private String employeeAddress;

   public EmployeeDetails(Integer employeeId, String employeeName, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;


}

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void display() {
            System.out.println("Employee name is:" +employeeName);
            System.out.println("Employee id:" +employeeId);
            System.out.println("Employee address:" +employeeAddress);



        }


    public String getName() {
        return null;
    }
}


