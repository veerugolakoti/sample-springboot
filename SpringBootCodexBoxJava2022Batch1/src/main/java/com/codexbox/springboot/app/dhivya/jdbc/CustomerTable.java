package com.codexbox.springboot.app.dhivya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerTable {
    Connection connection = null;
    Statement statement=null;
    public void creatingTable() {
        try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch", "root", "Dhivya");
        String table="create table Customer_Demographic( ID int(20) primary key,Name varchar(50),Address varchar(150),Aadhar int(50) unique , Phone int (10) unique ,DOB varchar(20) unique, Email varchar (150) unique)";
        System.out.println("Table has Created");
        statement=connection.createStatement();
        statement.execute(table);
    } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}