package com.codexbox.springboot.app.sohailspringbootproject.jdbc;

import com.codexbox.springboot.app.sohailspringbootproject.test.DataBaseSingletonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    public static DataBaseSingletonConnection dataBaseSingletonConnection;
    private static Connection connection;
    private SingletonConnection(){
    }

    public static Connection getConnection(){
        if(connection ==null){
            try {
                connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java","root","sohail");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

}
