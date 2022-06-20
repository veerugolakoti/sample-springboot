package com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDetails {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    public void customerDetails(){
//        1 step jdbc  load driver login
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            2 step get connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1", "root", "vidyacodexbox");
            statement=  connection.createStatement();
            String customers = "Create table customerDetails (Customer_Name varchar(20),Customer_Id int(10) primary key,Customer_Email varChar(25) unique,Customer_Aadharno bigint unique,Customer_Phoneno bigint unique,Customer_DateOfBirth varchar(20) unique,Customer_Address varchar(25) unique )";
            statement.execute(customers);
            System.out.println("table created");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
