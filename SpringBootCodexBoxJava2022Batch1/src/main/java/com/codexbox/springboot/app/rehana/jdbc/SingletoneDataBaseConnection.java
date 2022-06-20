package com.codexbox.springboot.app.rehana.jdbc;

import com.oracle.webservices.internal.api.message.PropertySet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletoneDataBaseConnection {
    private static Connection connection;
    private static SingletoneDataBaseConnection singletoneDataBaseConnection;
    @Value("${Datasource.driver}")
    private String driver;
    @Value("${Datasource.Url}")
    private String Url;
    @Value("${Datasource.userName}")
    private String userName;
    @Value("${Datasource.password}")
    private String password;
    private SingletoneDataBaseConnection(){

    }


    public static SingletoneDataBaseConnection singletoneDataBaseConnection() {
        if (singletoneDataBaseConnection == null) {
            singletoneDataBaseConnection = new SingletoneDataBaseConnection();
        }
        return singletoneDataBaseConnection;
    }

    public Connection getSingletoneDataBaseConnection() throws ClassNotFoundException, SQLException {
        if (null == connection) {
            Class.forName(driver);
            connection = DriverManager.getConnection(Url, userName, password);
        }
        return connection;
    }
}












