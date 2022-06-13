package com.codexbox.springboot.app.codexbox.BhargavTej.assesment3;

public class CodexBoxEmployee {
    private String employeename ;
    private Integer employeeId;
    private String employeeAddress;

    public CodexBoxEmployee(String name,Integer Id,String Address){
        this.employeename = name;
        this.employeeId = Id;
        this.employeeAddress = Address;
    }
    public void display(){
        System.out.println("Details of Employees " );
        System.out.println("Employee name is :" + employeename );
        System.out.println("Employee Id is :" + employeeId);
        System.out.println("Employee Address is :" +employeeAddress);
    }

    public String getEmployeename() {
        return employeename;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }
}
