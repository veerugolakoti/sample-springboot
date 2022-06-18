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

        PreparedStatement ps= null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_schema", "root", "Ganesh@1998");

            //  String str = "CREATE TABLE customer_details ( ID int(20),Aadhar varchar(25), FirstName varchar(255), Address varchar(255),  City varchar(255))";


            String str = "CREATE TABLE customer_details ( ID int(10),Aadhar varchar(255),phonenumber varchar(25),DoB varchar(20),Email varchar(30),Address varchar(250),PRIMARY KEY (ID))";
            ps = con.prepareStatement(str);
            int k = ps.executeUpdate();
            System.out.println("Table created");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if ((con!= null)&&(ps!=null)) {
                try {
                    con.close();
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }

        }

    }
}