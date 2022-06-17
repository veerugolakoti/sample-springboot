package com.codexbox.springboot.app.rajat.jdbc;

import com.codexbox.springboot.app.Veeru.employee.Employee;


import java.sql.*;
import java.util.List;

public class JdbcEmployee {
    public void getEmployee() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from Employee");
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
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
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
