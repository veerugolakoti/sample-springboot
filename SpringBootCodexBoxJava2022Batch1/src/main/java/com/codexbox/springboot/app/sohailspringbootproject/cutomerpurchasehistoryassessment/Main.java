package com.codexbox.springboot.app.sohailspringbootproject.cutomerpurchasehistoryassessment;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
      CustomerDetails customerDetails = new CustomerDetails();
        try {
            customerDetails.getCustomerDetailsTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
