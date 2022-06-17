package com.codexbox.springboot.app.rajat.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOperation {
    public void getEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which employee do you remove that employee id enter::");

        int id = sc.nextInt();
        Connection connection = null;
        PreparedStatement pStatement = null;
//        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();
            String query =  "delete from Employee where Id=? ";
            pStatement = connection.prepareStatement(query);
            pStatement.setInt(1,id);

            int resultSet = pStatement.executeUpdate();
            if (resultSet == 1) {
                System.out.println("Delete Successfully");
                JdbcEmployee jdbcEmployee = new JdbcEmployee();
                jdbcEmployee.getEmployee();
            }else{
                System.out.println("Invalid Id plz enter valid Id...");
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
