package com.codexbox.springboot.app.rajat.assessment5;

import com.codexbox.springboot.app.rajat.jdbc.SingleJdbcConnection;

import java.sql.*;

public class CreateCustomerDemographicDetailTable {
    public void createTable() {
        Connection connection = null;
        Statement statement = null;
//        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();
            statement = connection.createStatement();
            String create="create table Customer_Demographic_Detail( cust_Id int primary key, cust_Name varchar(30) , cust_Dob date, Address varchar(40), Phone_No int(15) unique, Addhar_No int(20) unique,Email varchar(50) unique);";
            boolean resultSet = statement.execute(create);
            if (resultSet==true){
                System.out.println("success");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }finally {

            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
