package com.codexbox.springboot.app.TejaAravind.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Configuration
public class ConnectionSingleton {
    private static Connection connection;
    private static ConnectionSingleton connectionSingleton;
    @Value("${datasource.driver}")
    public String driver;
    @Value("${datasource.url}")
    private String url;
    @Value("${datasource.user.name}")
    private String username;
    @Value("${datasource.password}")
    private String password;
    private ConnectionSingleton(){

    }
    public Connection getDatabaseConnection() throws SQLException, ClassNotFoundException {
        if (connection == null){
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
    public static ConnectionSingleton getConnectionSingleton(){
        if (connectionSingleton == null){
            connectionSingleton = new ConnectionSingleton();
        }
        return connectionSingleton;
    }


}
