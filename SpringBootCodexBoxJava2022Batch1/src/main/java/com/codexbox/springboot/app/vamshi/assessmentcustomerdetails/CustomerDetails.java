package com.codexbox.springboot.app.vamshi.assessmentcustomerdetails;

import java.sql.*;
import java.util.Scanner;

public class CustomerDetails {

    public void insertDetails() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of customers list");
        int number = scanner.nextInt();

        Integer id;
        String name ;
        String address;
        Long aadhar ;
        Long phone ;
        String date ;
        String email ;
        Connection connection=null;
        PreparedStatement statement=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavabatch4", "root", "vamshi@V2");
            String query ="Insert Into customer_details value (?,?,?,?,?,?,?);";
            statement = connection.prepareStatement(query);
            for(int i =1; i<=number;i++) {
                System.out.println("Enter ID : ");
                id = scanner.nextInt();
                System.out.println("Enter name : ");
                name = scanner.next();
                System.out.println("Enter Address : ");
                address = scanner.next();
                System.out.println("Enter Aadhar : ");
                aadhar = scanner.nextLong();
                System.out.println("Enter Phone no : ");
                phone = scanner.nextLong();
                System.out.println("Enter DOD : ");
                date = scanner.next();
                System.out.println("Enter Email : ");
                email = scanner.next();
                statement.setInt(1, id);
                statement.setString(2, name);
                statement.setString(3, address);
                statement.setLong(4, aadhar);
                statement.setLong(5, phone);
                statement.setString(6, date);
                statement.setString(7, email);
                statement.executeUpdate();
            }
            System.out.println("inserted details");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(null != connection) connection.close();
            if(null != statement) statement.close();
        }


    }
}
