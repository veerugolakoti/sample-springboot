package com.codexbox.springboot.app.HarshaDeepthi.JDBC;

import java.sql.*;

public class JdbcExample {
    public void getDbms() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "harsha");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Students");
            while (resultSet.next()) {

                System.out.println(resultSet.getInt("ID") + "   " + resultSet.getString("StudentName") + "    " + resultSet.getString("Address"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
