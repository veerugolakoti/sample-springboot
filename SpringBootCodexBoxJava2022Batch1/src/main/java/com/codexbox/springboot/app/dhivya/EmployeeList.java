package com.codexbox.springboot.app.dhivya;
public class EmployeeList {
    public String name;
    public Integer Id;
    public String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public  void detils(){
        System.out.println("---------------------------------------------------");
        System.out.println(name + " " + Id  + " " +  address);
        //System.out.println(Id);
        //System.out.println(address);
    }
}

