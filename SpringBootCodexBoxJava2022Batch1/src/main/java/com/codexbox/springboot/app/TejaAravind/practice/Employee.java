package com.codexbox.springboot.app.TejaAravind.practice;

import java.util.Scanner;

public abstract class Employee{
    private String name;
    private Integer empId;
    private String address;

    public  void  setDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name : ");
        this.name = in.nextLine();
        System.out.println("Enter Employee Id : ");
        this.empId = Integer.parseInt(in.nextLine());
        System.out.println("Enter Address : ");
        this.address = in.nextLine();
    }
    public void display(){
        System.out.println("======================");
        System.out.println("Employee details ");
        System.out.println("Name : " + name);
        System.out.println("Id : "+ empId);
        System.out.println("Address : " +address);
        System.out.println();

    }

    public String getName() {
        return name;
    }



    public Integer getEmpId() {
        return empId;
    }


    public String getAddress() {
        return address;
    }


}
