package com.codexbox.springboot.app.jhansiproject.assesment;


import java.util.Scanner;

public class
EmployeeDetails {
    private String name;
    private int id;
    private String address;
    public EmployeeDetails(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}