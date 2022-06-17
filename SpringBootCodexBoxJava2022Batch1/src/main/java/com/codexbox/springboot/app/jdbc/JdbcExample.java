package com.codexbox.springboot.app.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public void employeeDetails()  throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {

            // Loading a driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a DB connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch_java", "root", "Codex@123");

            //creating a statement
            statement = connection.createStatement();

            //Execute query
            rs = statement.executeQuery("Select * from Employee_Test");
            List<Employee> list = new ArrayList<>();
            //Get the values of the record using while loop
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployee_id(rs.getInt("Employee_ID"));
                employee.setEmployeeName(rs.getString("Employee_Name"));
                employee.setEmployeePM_salary(rs.getInt("Employee_PM_salary"));
                list.add(employee);
                //store the values which are retrieved using ResultSet and print it
            }
            for (Employee employeelist:list) {
                System.out.println(employeelist.getEmployee_id());
                System.out.println(employeelist.getEmployeeName());
                System.out.println(employeelist.getEmployeePM_salary());
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }finally {
            if(rs!=null) {
                rs.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(connection!=null) {
                connection.close();
            }
        }


    }

}



