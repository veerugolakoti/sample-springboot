package com.codexbox.springboot.app.codexbox.BhargavTej.Jdbc;

import java.sql.*;

public class JdbcExample2 {
    public void getEmployeedata(){
        Connection connection= null;
        PreparedStatement prestatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_example", "root", "Saiteja@27");
            String query = "SELECT * FROM sql_example.employeedetails;";
            prestatement = connection.prepareStatement(query);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
