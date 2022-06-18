package com.codexbox.springboot.assement5;

import java.sql.*;
import java.util.Scanner;

import static java.sql.DriverManager.*;

public class CustomerInsertdata {
    Connection connection = null;
    PreparedStatement statement = null;

    public void getCustomerHistory() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "codex@123");
            String query = "insert into Customer_details values (?,?,?,?,?,?)";
            statement = connection.prepareStatement(query);
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the cusid :  ");
                int id = sc.nextInt();
                statement.setInt(1, id);
                System.out.println("enter the cusname :");
                String name = sc.next();
                statement.setString(2, name);
                System.out.println("enter the cusaddress :");
                String address = sc.next();
                statement.setString(3, address);
                System.out.println("enter the cusphone :");
                int phone = sc.nextInt();
                statement.setInt(4, phone);
                System.out.println("enter the cus dob :");
                String  dob = sc.next();
                statement.setString(5, dob);
                System.out.println("enter the cusemail :");
                String mail = sc.next();
                statement.setString(6, mail);
                statement.execute();

            } catch(ClassNotFoundException e){
                throw new RuntimeException(e);
            } finally{
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }