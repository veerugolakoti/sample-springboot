package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import java.lang.reflect.ParameterizedType;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDetails {
    private Integer CustomerId;
    private String CustomerName;
    private Long CustomerAadhaar;
    private Long CustomerPhone;
    private String CustomerDOB;
    private String CustomerEmail;
    private String CustomerAddress;

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Long getCustomerAadhaar() {
        return CustomerAadhaar;
    }

    public void setCustomerAadhaar(Long customerAadhaar) {
        CustomerAadhaar = customerAadhaar;
    }

    public Long getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(Long customerPhone) {
        CustomerPhone = customerPhone;
    }

    public String getCustomerDOB() {
        return CustomerDOB;
    }

    public void setCustomerDOB(String customerDOB) {
        CustomerDOB = customerDOB;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public PreparedStatement setCustomerDetails(Integer id, String name, Long aadhaar, Long phone, String dob, String email, String address, PreparedStatement pstmt) throws SQLException {
        pstmt.setInt(1,  id);
        pstmt.setString(2, name);
        pstmt.setLong(3, aadhaar);
        pstmt.setLong(4,phone);
        pstmt.setString(5,dob);
        pstmt.setString(6, email);
        pstmt.setString(7, address);
        return  pstmt;
    }
}
