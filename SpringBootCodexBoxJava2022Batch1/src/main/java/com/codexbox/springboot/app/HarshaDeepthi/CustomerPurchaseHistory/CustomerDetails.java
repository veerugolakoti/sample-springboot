package com.codexbox.springboot.app.HarshaDeepthi.CustomerPurchaseHistory;

import java.sql.*;

public class CustomerDetails {
    public void details(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "harsha");

            Statement statement = connection.createStatement();


            String Query="CREATE TABLE CustomerDetails (ID int PRIMARY KEY,Name varchar(255),Address varchar(255),Adharnumber int UNIQUE KEY,pnhonenumber int UNIQUE KEY,dob  varchar(100),Email varchar(25) UNIQUE KEY)";
            statement.executeUpdate(Query);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
