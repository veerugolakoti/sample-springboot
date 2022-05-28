package com.codexbox.springboot.app.HarshaDeepthi;

import java.util.ArrayList;
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
}

    /*public void findemployeedetalis() {
        List<String> employeelist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <=29; i++) {

            System.out.println("Enter Employee id:");
             employeelist.add(sc.next());
            System.out.println("Enter Employee Name:");
          employeelist.add(sc.next());
            System.out.println("Enter Employee address:");
            employeelist.add(sc.next());


            System.out.println("Employee Details Compleated");
            for(Object c:employeelist)
            System.out.println("employeelist  "   +c);

        }

    }

}*/
//public class ArrayList{
   // public void list(){
     //   List<String>  emplist=new ArrayList<>();

    //}
//}