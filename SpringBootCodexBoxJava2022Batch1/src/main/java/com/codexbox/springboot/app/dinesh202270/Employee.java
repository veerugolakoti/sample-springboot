package com.codexbox.springboot.app.dinesh202270;

public class Employee {
    private String name;
    private String address;
    private int id;
    public Employee(String name, String address, int id) {

        this.name = name;
        this.address = address;
        this.id = id;
    }
    public void printData() {

      //  System.out.println("Name\tAddress\tContactNo");
        System.out.println("EMPLOYEE DETAILS : "+name + "\t" + address + "\t" + id);
        System.out.println("________________________________");
    }
}

