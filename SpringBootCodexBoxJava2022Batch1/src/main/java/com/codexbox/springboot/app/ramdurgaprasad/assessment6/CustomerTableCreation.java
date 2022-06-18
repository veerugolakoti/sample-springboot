package com.codexbox.springboot.app.ramdurgaprasad.assessment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerTableCreation {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplecode", "root", "Hitm@n0808");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " customer_name VARCHAR(255) , " +
                    " aadhaar_number BIGINT unique , " +
                    " phone_number BIGINT  unique, " +
                    "date_of_birth VARCHAR(20)," +
                    "customer_email VARCHAR(55) unique," +
                    "getCustomer_address VARCHAR(255)," +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

        } catch (SQLException e) {
            System.out.println("===# .The database table you are trying to create is already exist so,please check your workbench and try again. #=== ");


        }
    }
}