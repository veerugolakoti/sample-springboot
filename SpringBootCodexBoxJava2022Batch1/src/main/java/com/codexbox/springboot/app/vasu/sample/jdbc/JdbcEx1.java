package com.codexbox.springboot.app.vasu.sample.jdbc;

import com.codexbox.springboot.app.vasu.sample.Employee1;
import com.sun.glass.ui.ClipboardAssistance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcEx1 {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public List<Employee1> employeeList() throws SQLException {
        List<Employee1> employee1List = new ArrayList<>();
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboox_vasu", "root", "V@asu666");
                String query = "select * from employee";
                preparedStatement=connection.prepareStatement(query);

                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Employee1 employee1 = new Employee1();
                    employee1.setId(resultSet.getInt("empid"));
                    employee1.setName(resultSet.getString("empname"));
                    employee1.setSalary(resultSet.getLong("empsalary"));
                    employee1.setAddress(resultSet.getString("empaddress"));
                    employee1List.add(employee1);
                }


            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                connection.close();
                preparedStatement.close();
                resultSet.close();

            }
            return employee1List;


        }
    }


