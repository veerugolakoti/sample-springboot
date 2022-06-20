package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CodexBoxConnection {

    private static CodexBoxConnection connectionDB;
    private static Connection connection;

    @Value("${source.driver}")
    private static String driver;

    @Value("${source.url}")
    private static String url;

    @Value("${source.user.name}")
    private static String userName;

    @Value("${source.password}")
    private static String password;

    private CodexBoxConnection(){
    }


    public static CodexBoxConnection getConnectionDB() {
        if (connectionDB == null)
        connectionDB = new CodexBoxConnection();
        return connectionDB;
    }

    public static Connection getConnectionDriver() throws ClassNotFoundException, SQLException {
        if (connection == null)
        Class.forName(driver);
        connection = DriverManager.getConnection(url, userName, password);
        return connection;

    }


}
//        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_example", "root", "Saiteja@27");