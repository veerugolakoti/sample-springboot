package com.codexbox.springboot.app.Veeru.employee;

public class Employee {
    private String name;
    private Integer eid;
    private String address;

    public  Employee(String name, Integer eid, String address) {
        this.name = name;
        this.eid = eid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getEid() {
        return eid;
    }

    public String getAddress() {
        return address;
    }
}
