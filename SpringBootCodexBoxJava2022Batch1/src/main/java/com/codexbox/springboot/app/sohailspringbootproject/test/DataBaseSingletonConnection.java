package com.codexbox.springboot.app.sohailspringbootproject.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseSingletonConnection {
    private static DataBaseSingletonConnection dataBaseSingletonConnection;
    @Value("${datasource.driver}")
    private String driver;

    @Value("${datasource.username}")
    private String userName;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    public String url;
    private static Connection connection;
    private DataBaseSingletonConnection(){

    }
    public static DataBaseSingletonConnection getdataBaseSingletonConnection(){
        if(dataBaseSingletonConnection==null){
            dataBaseSingletonConnection = new DataBaseSingletonConnection();
        }
        return dataBaseSingletonConnection;
    }

    public  Connection getConnection() throws ClassNotFoundException, SQLException {
        if(connection == null){
            Class.forName(driver);
            connection = DriverManager.getConnection(url,userName,password);
        }
        return connection ;
    }

}
