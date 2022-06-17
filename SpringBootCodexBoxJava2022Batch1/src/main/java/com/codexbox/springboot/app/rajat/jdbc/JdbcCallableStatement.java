package com.codexbox.springboot.app.rajat.jdbc;

import java.sql.*;

public class JdbcCallableStatement {
    public void getStoreAndRetriveData(){
        Connection connection = null;
      CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();

            callableStatement = connection.prepareCall("call Employee_Detail");
//            "select * from Employee"
            resultSet = callableStatement.executeQuery("select * from Employee");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id")+" "+
                        resultSet.getString("Employee_Name")+" "+
                        resultSet.getString("Address")+" "+
                        resultSet.getInt("Salary"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                callableStatement.close();
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
