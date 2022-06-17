package com.codexbox.springboot.app.vidyadarna.jdbcexample;

import com.codexbox.springboot.app.vidyadarna.Employee;

import javax.management.Query;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;

    //    List<Employee> employees = new ArrayList<>();
    public void jdbcExample() {
        try {
//            first step jdbc driver login
//            Class.forName("com.mysql.cj.jdbc.Driver");
// step2 get connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1", "root", "vidyacodexbox");
//            String Query = "Select * From Persons";
//            step 3 create statement
            statement = connection.createStatement();
//            step 4 excute statement

            rs = statement.executeQuery("SELECT * FROM Persons");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);

        }finally {
            try {
                rs.close();
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
//        step 5 close
    }
}
