package com.codexbox.springboot.app.vamshi.assessmentcustomerdetails;

import java.sql.*;

public class CustomerTable {
    public void customerTableCreation() throws SQLException {

        Connection con = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavabatch4", "root", "vamshi@V2");
            String query = "CREATE TABLE customer_details(Customer_ID int(10) PRIMARY KEY,Customer_Name varchar(45),customer_address varchar(222),Customer_Aadhar_no bigint unique key,Customer_Phone_no bigint unique key ,Customer_DOD varchar(30),Customer_Email varchar(30) unique key)";
            statement = con.createStatement();
            statement.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }finally {
            con.close();
            statement.close();
        }
    }
}
