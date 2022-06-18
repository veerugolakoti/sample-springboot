package com.codexbox.springboot.app.vamshi.jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public  class JdbcSample {
    public List<EmployeeJdbc> getEmployee() {
        List<EmployeeJdbc> employeeJdbcs = new ArrayList<>();
        Connection con = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavabatch4", "root", "vamshi@V2");

            String query = "select * from javabatch4";
            //Create statement
            statement = con.createStatement();
            //execute query
            resultset = statement.executeQuery(query);
            while (resultset.next()) {
                EmployeeJdbc employeeJdbc = new EmployeeJdbc();
                employeeJdbc.setPersonID(resultset.getInt("personID"));
                employeeJdbc.setLastName(resultset.getString("LastName"));
                employeeJdbc.setFirstName(resultset.getString("FirstName"));
                employeeJdbc.setAddress(resultset.getString("Address"));
                employeeJdbc.setCity(resultset.getString("City"));
                employeeJdbcs.add(employeeJdbc);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (null != resultset)
                    resultset.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (null != statement)
                    statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (null != con)
                    con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeJdbcs;
    }
}
