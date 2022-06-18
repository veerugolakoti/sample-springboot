package com.codexbox.springboot.app.TejaAravind.customerPurchasehistory;

import java.util.List;

public class CustomerPurchaseHistoryMainApp {
    public static void main(String[] args) {
        JdbcDriverClass driver  = new JdbcDriverClass();
        List<CustomerHistoryData> list  = driver.getCustomerdetails();
        for (CustomerHistoryData data : list) {
            System.out.println("--------------------------------------------------");
            System.out.println(data.getId());
            System.out.println(data.getName());
            System.out.println(data.getAadharNo());
            System.out.println(data.getPhoneNo());
            System.out.println(data.getDateOfBirth());
            System.out.println(data.getEmail());
            System.out.println(data.getAddress());
        }


    }

}
