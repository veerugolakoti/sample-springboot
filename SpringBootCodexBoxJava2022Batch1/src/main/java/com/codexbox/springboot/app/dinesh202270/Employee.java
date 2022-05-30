package com.codexbox.springboot.app.dinesh202270;

import com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application;

import java.util.Scanner;

public class Employee {
    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private int id;


    public Employee(String name, String address, int id) {

        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Employee()
    {

    }
    public void printData() {

      //  System.out.println("Name\tAddress\tContactNo");
        System.out.println("EMPLOYEE DETAILS : "+name + "\t" + address + "\t" + id);
        System.out.println("________________________________");
    }




}

