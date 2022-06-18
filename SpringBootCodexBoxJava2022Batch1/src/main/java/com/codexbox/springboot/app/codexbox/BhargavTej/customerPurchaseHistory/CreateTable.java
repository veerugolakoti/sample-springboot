package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class CreateTable {
    public void creationOfTable() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_example", "root", "Saiteja@27");
            statement = connection.createStatement();
            String query = " create table customer_table (customer_id INTEGER not null,customer_name VARCHAR(50)," +
                    "customer_aadhaar BIGINT (12) UNIQUE,customer_phone BIGINT(10) UNIQUE,customer_DOB VARCHAR(10)," +
                    "customer_email VARCHAR(50) UNIQUE,customer_address VARCHAR(200),PRIMARY KEY (customer_id))";
            statement.executeUpdate(query);
            System.out.println("Customer table is created");

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            if (connection!=null)
                connection.close();
            if (statement!=null)
                statement.close();
        }
    }
}
