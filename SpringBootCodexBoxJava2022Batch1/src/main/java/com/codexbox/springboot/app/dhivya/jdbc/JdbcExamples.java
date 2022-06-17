package com.codexbox.springboot.app.dhivya.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExamples {
    Connection connection = null;
    //Statement statement = null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet = null;
    public List<EmployeeList> getEmployeeLists() {
        List<EmployeeList> employeeLists = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch", "root", "Dhivya");
           // statement = connection.createStatement();
            preparedStatement= connection.prepareStatement("Select * from employee");
            String query = "Select * from employee";
            //resultSet = statement.executeQuery(query);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                EmployeeList employeeList = new EmployeeList();
                employeeList.setEmployeeId(resultSet.getInt("Employee_Id"));
                employeeList.setEmployeeName(resultSet.getString("Employee_Name"));
                employeeList.setEmployeeAddress(resultSet.getString("Employee_Address"));
                employeeList.setSalary(resultSet.getLong("Salary"));
                employeeLists.add(employeeList);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                if (null != resultSet)
                    resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                //if (null != statement)
                  //  statement.close();
                if(null!=preparedStatement)
                    preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (null != connection)
                    connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeLists;
    }

}






