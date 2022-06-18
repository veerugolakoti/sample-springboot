package com.codexbox.springboot.app.swathi.assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {

    private String employeeName = "";
    private String employeeAddress = "";
    private String employeeId = "";

  public EmployeeDetails(String empName,String empAdd,String empId)
    {
        this.employeeName = empName;
        this.employeeAddress = empAdd;
        this.employeeId = empId;
    }
    public void printEmployeeDetails()
    {
        System.out.println("empname\t empaddress\t empid");
        System.out.println(employeeName + "\t" + employeeAddress + "\t" + employeeId);
    }

}