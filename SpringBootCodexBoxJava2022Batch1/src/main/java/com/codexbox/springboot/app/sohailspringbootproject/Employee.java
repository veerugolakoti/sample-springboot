package com.codexbox.springboot.app.sohailspringbootproject;

public  class Employee {
    private String name;
    private Integer id;
    private String address;
    String empName;

    public String getEmpName() {
        return empName;
    }

    public Employee(String name, Integer id, String address){
        this.name=name;
        this.id= id;
        this.address= address;


    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}


