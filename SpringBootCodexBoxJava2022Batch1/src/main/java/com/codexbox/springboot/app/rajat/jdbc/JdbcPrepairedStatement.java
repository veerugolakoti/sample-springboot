package com.codexbox.springboot.app.rajat.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcPrepairedStatement {
    public void getEmployee() {
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
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();
            String query =  "select * from Employee where Id=? and Employee_Name = ? and Address= ? and Salary =?";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1,id);
            pStatement.setString(2,name);
            pStatement.setString(3,address);
pStatement.setInt(4,sal);

            resultSet = pStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id")+" "+
                        resultSet.getString("Employee_Name")+" "+
                        resultSet.getString("Address")+" "+
                        resultSet.getInt("Salary"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (resultSet != null)
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
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
