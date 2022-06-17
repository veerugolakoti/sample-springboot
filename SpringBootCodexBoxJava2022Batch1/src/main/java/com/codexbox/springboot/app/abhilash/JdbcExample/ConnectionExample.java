package com.codexbox.springboot.app.abhilash.JdbcExample;

import java.sql.*;

public class ConnectionExample {
    public void establish() throws SQLException {
        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        //step1 :load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // step 2: making connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox","root","ABHIL@sh123");
            //step 3: create statement
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("select * from employee");
            while(resultSet.next()) {
                System.out.println("[" + resultSet.getString("id")+" "+
                resultSet.getString("name")+ " "+
                resultSet.getString("address") +"]");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(null != resultSet) resultSet.close();
            if(null != stmt) stmt.close();
             if(null != connection)connection.close();

        }
    }
}
