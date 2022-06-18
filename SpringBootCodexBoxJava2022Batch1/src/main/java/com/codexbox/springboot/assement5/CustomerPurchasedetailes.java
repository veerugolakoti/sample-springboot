package com.codexbox.springboot.assement5;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class CustomerPurchasedetailes {
    Connection connection = null;
    Statement statement = null;

    public  void getCustmerDetailes(){

   try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "codex@123");
              statement=connection.createStatement();
             String query = "Create table Customer_details(cus_id int(20) primary key, cus_name varchar(50), cus_address varchar(50), cus_phone int(10), cus_dod , cus_gmail varchar(60))";


             statement.executeUpdate(query);


         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
         finally {
       if (statement !=null){
           try {
               statement.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
             if(connection != null){
                 try {
                     connection.close();
                 } catch (SQLException e) {
                     throw new RuntimeException(e);
                 }

             }

             }
     }}