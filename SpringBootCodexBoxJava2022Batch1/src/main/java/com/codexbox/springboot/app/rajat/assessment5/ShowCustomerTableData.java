package com.codexbox.springboot.app.rajat.assessment5;

import com.codexbox.springboot.app.rajat.jdbc.SingleJdbcConnection;

import java.sql.*;

public class ShowCustomerTableData {
    public void getCustomer() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java_batch1","root","rajat");
            connection = SingleJdbcConnection.getSinglConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from Customer_Demographic_Detail");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("cust_Id")+"  "+
                        resultSet.getString("cust_Name")+"  "+
                        resultSet.getString("cust_Dob")+"  "+
                        resultSet.getString("Address")+"  "+
                        resultSet.getString("Phone_No")+"  "+
                                resultSet.getString("Addhar_No")+"  "+
                                resultSet.getString("Email"));
            }

        } catch (ClassNotFoundException | SQLException e) {
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
