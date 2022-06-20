package com.codexbox.springboot.app.vasu.sample.customerpurchasehistory;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer {
   Integer customerid;
   String customername;
   Long customeradhar;
   Long customerphoneNumber;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public long getCustomeradhar() {
        return customeradhar;
    }

    public void setCustomeradhar(long customeradhar) {
        this.customeradhar = customeradhar;
    }

    public long getCustomerphoneNumber() {
        return customerphoneNumber;
    }

    public void setCustomerphoneNumber(long customerphoneNumber) {
        this.customerphoneNumber = customerphoneNumber;
    }

   public PreparedStatement setCustomer(Integer id, String name, Long aadhar, Long phoneNumber, PreparedStatement pstmt) throws SQLException {
        pstmt.setInt(1,id);
        pstmt.setString(2,name);
        pstmt.setLong(3,aadhar);
        pstmt.setLong(4,phoneNumber);

        return pstmt;
    }

}
