package com.codexbox.springboot.app.codexbox.BhargavTej;

public class CodexBoxEmployee { private String employeename ;
    private Integer employeeId;
    private String employeeAddress;

    public CodexBoxEmployee(String name,Integer Id,String Address){
        this.employeename = name;
        this.employeeId = Id;
        this.employeeAddress = Address;
    }
    public void display(){
        System.out.println("Details of Empoyees");
        System.out.println("Employee name is :" + employeename + " "+ employeeId + "  " + employeeAddress );
//        System.out.println("Employee Id is :" + employeeId);
//        System.out.println("Employee Address is :" +employeeAddress);
    }

}
