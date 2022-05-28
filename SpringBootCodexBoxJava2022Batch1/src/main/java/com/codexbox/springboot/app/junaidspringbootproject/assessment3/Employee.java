package com.codexbox.springboot.app.junaidspringbootproject.assessment3;

public class Employee
{
   private String employeeName = "";
   private String employeeAddress = "";
    private String employeeId = "";

   public Employee(String empName, String empId, String empAdd)
   {
       this.employeeName = empName;
       this.employeeAddress = empAdd;
       this.employeeId = empId;

   }
   public void printEmployee()
   {
       System.out.println("Name\tAddress\tContactNo");
       System.out.println(employeeName + "\t" + employeeId + "\t" + employeeAddress);
   }
}
