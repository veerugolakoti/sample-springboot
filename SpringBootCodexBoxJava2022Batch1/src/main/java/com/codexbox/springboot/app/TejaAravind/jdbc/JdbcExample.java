package com.codexbox.springboot.app.TejaAravind.jdbc;

import com.codexbox.springboot.app.Veeru.employee.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public List<Employee> getDetails(){
        List<Employee> empList = new ArrayList<>();
        // step 1 get the drivers and maven dependencies
        try {
        // step 2 register
            Class.forName("com.mysql.cj.jdbc.Driver");
        // step3 connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexsample","root","teja@codex");
            String query = "select * from employee";

            // step 4 create statement
            Statement statement = connection.createStatement();
            statement.execute(query);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return empList;


    }
}
