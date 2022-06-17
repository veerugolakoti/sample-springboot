package com.codexbox.springboot.app.vidyadarna;

public class Employee {


    public static Object employee;


    public String getEmployeeName() {
        return EmployeeName;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    private String EmployeeName;
    private Integer EmployeeId;
    private String EmployeeAddress;

    public  Employee(String Name, int id, String address){
        this.EmployeeName = Name;
        this.EmployeeId = id;
        this.EmployeeAddress = address;
    }
public void PrintDisplay(){
    System.out.println("EmployeeName" + " EmployeeId"+ "EmployeeAddress" );
    System.out.println(EmployeeName+ "\t" + EmployeeId + " \t " + EmployeeAddress);
}



}





