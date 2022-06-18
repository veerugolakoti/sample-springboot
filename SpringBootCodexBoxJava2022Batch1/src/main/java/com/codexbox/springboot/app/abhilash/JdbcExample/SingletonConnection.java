package com.codexbox.springboot.app.abhilash.JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    public static Connection connection = null;
    private SingletonConnection() {

    }
        public static Connection getInstance() {
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox","root","ABHIL@sh123");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            return connection;
        }
    }