package com.codexbox.springboot.app.vasu.sample.customerpurchasehistory;

import java.sql.*;

public class CreateTable {


    public void customerTable() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboox_vasu", "root", "V@asu666");
            statement = connection.createStatement();
            String query = "create table customer_table(customerid int,customer_name varchar(10)," +
                    "customer_aadhar BIGINT,phone_number BIGINT)";
            statement.execute(query);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null)
                statement.close();
            if (statement != null)
                connection.close();


        }

    }
}

