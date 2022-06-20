package com.codexbox.springboot.app.vasu.sample.jdbc;

import com.codexbox.springboot.app.vasu.sample.Employee1;
import com.codexbox.springboot.app.vasu.sample.assesment.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEx {
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    public List<Employee1> getEmployee1List() {
        List<Employee1> employee1List = new ArrayList<>();
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // get the connection
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboox_vasu", "root", "V@asu666");
            String query = "select * from codexboox_vasu.employee";
            // create statement
            statement = connection.createStatement();
            // execute query
            resultSet= statement.executeQuery(query);
            // extract result
            while ((resultSet.next())) {
                Employee1 employee = new Employee1();
                employee.setId(resultSet.getInt("empid"));
                employee.setName(resultSet.getString("empname"));
                employee.setSalary(resultSet.getLong("empsalary"));
                employee.setAddress(resultSet.getString("empaddress"));
                employee1List.add(employee);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
           try {
               resultSet.close();
               statement.close();
               connection.close();


                } catch (SQLException e) {
               throw new RuntimeException(e);
           }
        }


        return employee1List;
    }
}


