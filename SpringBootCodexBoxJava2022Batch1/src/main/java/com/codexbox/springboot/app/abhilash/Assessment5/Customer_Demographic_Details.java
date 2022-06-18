package com.codexbox.springboot.app.abhilash.Assessment5;

import com.codexbox.springboot.app.abhilash.JdbcExample.SingletonConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class Customer_Demographic_Details {

    public void create() {
        Statement statement = null;
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            SingletonConnection.getInstance();
             statement = SingletonConnection.connection.createStatement();
            String create_query = "create table  (" +
                    "id tinyint, name varchar(50)," +
                    " aadhar bigint, phone bigint, dob date," +
                    "gmail varchar(50),address varchar(100)," +
                    "primary key(id), UNIQUE(id), UNIQUE(aadhar)," +
                    " UNIQUE(phone), UNIQUE(gmail))";
            statement.execute(create_query);
            System.out.println(statement.execute(create_query) + " is successful");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            try {
                if(null != statement)statement.close();
                if(null != SingletonConnection.connection) SingletonConnection.connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
