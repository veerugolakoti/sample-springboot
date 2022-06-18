package com.codexbox.springboot.app.Chandan.assessment3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesDetails {

    private String Employee_name;
    private long Employee_ID;
    private String Employee_Address;

    public EmployeesDetails(String Employee_name, long Employee_ID, String Employee_Address) {

        this.Employee_name = Employee_name;
        this.Employee_ID = Employee_ID;
        this.Employee_Address = Employee_Address;





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

    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public long getEmployee_ID() {
        return Employee_ID;
    }

    public String getEmployee_Address() {
        return Employee_Address;
    }
}
