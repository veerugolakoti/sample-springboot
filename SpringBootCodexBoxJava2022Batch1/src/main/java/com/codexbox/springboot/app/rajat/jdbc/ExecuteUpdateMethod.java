package com.codexbox.springboot.app.rajat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteUpdateMethod {
    public void setEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id::");
        int id = sc.nextInt();
        System.out.println("Enter your name::");
        String name = sc.next();
        System.out.println("Enter your Address::");
        String address  = sc.next();
        System.out.println("Enter your salary::");
        int sal = sc.nextInt();
        Connection connection = null;
        PreparedStatement pStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            String query = "insert into Employee values(?,?,?,?)";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1,id);
            pStatement.setString(2,name);
            pStatement.setString(3,address);
            pStatement.setInt(4,sal);

            int resultSet = pStatement.executeUpdate();
            if (resultSet == 1) {
                System.out.println("Update Successfully");
                JdbcEmployee jdbcEmployee = new JdbcEmployee();
                jdbcEmployee.getEmployee();
            }else{
                System.out.println("Invalid entries...");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                pStatement.close();
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
