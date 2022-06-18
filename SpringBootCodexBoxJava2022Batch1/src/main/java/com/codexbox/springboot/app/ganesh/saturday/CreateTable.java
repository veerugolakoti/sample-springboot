package com.codexbox.springboot.app.ganesh.saturday;

import java.sql.*;

public class CreateTable {

    public void m2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema","root","Ganesh@1998");


            String str = "CREATE TABLE customer_details (\n" +
                    "    ID int,\n" +
                    "    Aadhar int(255),\n" +
                    "    phonenumber int(255),\n" +
                    "     dob varchar(255),\n" +
                    "      EmailID varchar(255),\n" +
                    "    Address varchar(255),\n" +
                    "    PRIMARY KEY (ID)\n" +")";
/*
            "CREATE TABLE customer_details (
                    ID int NOT NULL,
                    Aadhar varchar(255) NOT NULL,
            FirstName varchar(255),
                    Age int,
            CONSTRAINT PK_Person PRIMARY KEY (ID,LastName)
)";*/


            try {
                Statement st = con.prepareStatement (str);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}