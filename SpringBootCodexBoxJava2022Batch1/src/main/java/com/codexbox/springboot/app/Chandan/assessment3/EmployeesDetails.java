package com.codexbox.springboot.app.Chandan.assessment3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesDetails {
    Scanner sc = new Scanner(System.in);
    private String Employee_name = sc.next();
    private long Employee_ID = sc.nextLong();
    private String Employee_Address = sc.next();

        public String getEmployee_name () {
            return Employee_name;
        }

        public void setEmployee_name (String employee_name){
            Employee_name = employee_name;
        }

        public long getEmployee_ID () {
            return Employee_ID;
        }

        public void setEmployee_ID ( long employee_ID){
            Employee_ID = employee_ID;
        }

        public String getEmployee_Address () {
            return Employee_Address;
        }

        public void setEmployee_Address (String employee_Address){
            Employee_Address = employee_Address;
        }
    }

    /*
    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }*/
/*

    public EmployeesDetails(String Employee, long Employee_ID, String Employee_Address) {

        this.Employee_name = Employee_name;
        this.Employee_ID = Employee_ID;
        this.Employee_Address = Employee_Address;
    }
*/



    /* public static void main(String []args){
         ArrayList<String> al = new ArrayList<>();
         al.add("Employee name");
         al.add("Employee_ID");
         al.add("Employee address");

         for(int i =0; i<30; i++){
             System.out.println("Details of employees");

             Scanner sc = new Scanner(System.in);

             System.out.print("Employee name:-");
             String str1 = sc.next();
             System.out.println(str1);

             System.out.println("Employee_ID");
*/



