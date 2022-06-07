package com.codexbox.springboot.app.vasu.sample.assesment;
public class Employee {
    private String Name;
    private Integer Id;
    private String Address;

    public String getName() {
        return Name;
    }

    public Integer getId() {
        return Id;
    }

    public String getAddress() {
        return Address;
    }

    public Employee(String Name, Integer Id, String Address){
        this.Name=Name;
        this.Id=Id;
        this.Address=Address;

    }


}
