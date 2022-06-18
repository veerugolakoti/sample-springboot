package com.codexbox.springboot.app.renuProjects.assessments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {

    private String empname;
    private int empid;
    private String address;

   public EmployeeDetails( String empname, int empid, String address) {
       this.empname = empname;
       this.address = address;
       this.empid = empid;
   }

    public String getEmpname() {
        return empname;
    }

    public int getEmpid() {
        return empid;
    }

    public String getAddress() {
        return address;
    }
}












