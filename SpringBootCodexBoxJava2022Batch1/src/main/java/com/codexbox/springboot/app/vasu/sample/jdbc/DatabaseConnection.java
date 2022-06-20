package com.codexbox.springboot.app.vasu.sample.jdbc;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;
   public static DatabaseConnection databaseConnection;
    @Value("${source.driver}")
    private  static String driver;
    @Value("${source.url}")
    private static String url;
    @Value("${source.name}")
    private static String name;
    @Value("${source.password")
    private  static String password;



    private DatabaseConnection() {
   }

   public static DatabaseConnection singleTon(){
        databaseConnection = new DatabaseConnection();

        return databaseConnection;
   }

       public Connection getDatabase() throws ClassNotFoundException, SQLException {
           if(null==connection){
               Class.forName(driver);
               connection= DriverManager.getConnection(url,name,password);
           }
           return connection;

       }

    }

