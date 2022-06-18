package com.codexbox.springboot.app.codexbox.BhargavTej.Jdbc;

import com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory.CustomerDetails;

public class Employee {
    private Integer id;
    private  String name;
    private  Long salary;
    private  String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
