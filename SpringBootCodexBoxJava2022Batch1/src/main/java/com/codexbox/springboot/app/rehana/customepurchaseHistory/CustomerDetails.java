package com.codexbox.springboot.app.rehana.customepurchaseHistory;

public class CustomerDetails {
    private Integer customer_id;
    private String name;
    private String Aadhar_number;
    private String phone_number;
    private String Date_of_birth;
    private String Email;
    private String address;

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhar_number() {
        return Aadhar_number;
    }

    public void setAadhar_number(String aadhar_number) {
        Aadhar_number = aadhar_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
