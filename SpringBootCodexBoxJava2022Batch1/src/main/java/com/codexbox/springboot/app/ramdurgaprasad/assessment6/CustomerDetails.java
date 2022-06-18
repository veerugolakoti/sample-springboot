package com.codexbox.springboot.app.ramdurgaprasad.assessment6;

public class CustomerDetails {
    private int id;
    private String customerName;
    private long aadhaarNumber;
    private long phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(long aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getGetCustomerAddress() {
        return getCustomerAddress;
    }

    public void setGetCustomerAddress(String getCustomerAddress) {
        this.getCustomerAddress = getCustomerAddress;
    }

    private String dateOfBirth;
    private String customerEmail;
    private String getCustomerAddress;



}
