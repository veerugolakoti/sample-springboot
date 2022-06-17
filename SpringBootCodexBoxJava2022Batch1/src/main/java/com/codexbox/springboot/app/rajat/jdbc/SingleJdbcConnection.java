package com.codexbox.springboot.app.rajat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleJdbcConnection {
     private static Connection connection;
     private  SingleJdbcConnection(){

     }
     public static  Connection getSinglConnection(){
         if (connection == null){
             try {
                 connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
             } catch (SQLException e) {
                 throw new RuntimeException(e);
             }
         }
         return connection;
     }
}
