package com.codexbox.springboot.app.jdbc;

import java.sql.*;

public class CustomerPurchaseHistory {
    public void customerpurchasetable() throws ClassNotFoundException {
        try {

            // loading a driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a DB connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch_java", "root", "Codex@123");

            //creating a statement
            Statement statement = connection.createStatement();
            String table = "create table CustomerPurchaseDetails(CustomerID int(10) primary key,Name varchar(250)," +
                    "AadharUID bigint,AddressDetails varchar(200),PhoneNo bigint,DOB date,EmailID varchar (100))";
            statement.executeUpdate(table);
            System.out.println("table is created");
        }catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch(SQLException e){
            throw new RuntimeException(e);

        }
    }
}
