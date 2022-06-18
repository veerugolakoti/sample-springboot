package com.codexbox.springboot.app.mounika.assesment5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDetails {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public void costomerpurches() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codex_java", "root", "Mounika");

            statement = connection.createStatement();
            String str="create table customerdetails(customerid int(10) primary key, customername varchar(55), customeraadhar int(55), customerphonenumber int(10) unique key, customerdob int(20), customeremail varchar(30) unique key)";
            statement.execute(str);
            System.out.println(" create table");


                } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
        /*} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }*/
        }









