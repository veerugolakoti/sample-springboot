package com.codexbox.springboot.app.vasu.sample.customerpurchasehistory;

import java.sql.*;
import java.util.Scanner;

public class CustomerDetails {

    public void insertDetails() throws SQLException {
        Connection connection=null;
        Customer customer=new Customer();
        PreparedStatement preparedStatement=null;
        try {
            Scanner scanner=new Scanner(System.in);
            for(int i =0;i<=3;i++) {
                System.out.println("Enter customer Id:  ");
                Integer id = scanner.nextInt();
                System.out.println("Enter customer Name: ");
                String name = scanner.next();
                System.out.println("Enter customer aadhar: ");
                Long aadhar = scanner.nextLong();
                System.out.println("Enter customer phonenumber:");
                Long phonenumber = scanner.nextLong();

                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboox_vasu", "root", "V@asu666");
                String query = "insert into customer_table values(?,?,?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement = customer.setCustomer(id,name,aadhar,phonenumber,preparedStatement);
                preparedStatement.execute();

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (preparedStatement !=null)preparedStatement.close();
            if (connection != null)connection.close();
        }

    }
}
