package com.codexbox.springboot.app.abhilash.JdbcExample;

import org.springframework.context.ApplicationContext;

import java.sql.*;

import static com.codexbox.springboot.app.abhilash.JdbcExample.SingletonConnection.connection;


public class UsingApplicationProperties {

    public static ApplicationContext example() throws SQLException {
        //Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;
       // PreparedStatement preparedStatement = null;


        try {
           SingletonUsingApplicationProps app = SingletonUsingApplicationProps.getConnectionforDB();


            System.out.println(app.getDriver());
            System.out.println(app.getUrl());
            System.out.println(app.getUsername());
            System.out.println(app.getPassword());
            app.getSingleton();
            SingletonUsingApplicationProps.getConnectionforDB();
            stmt = connection.createStatement();
            resultSet = stmt.executeQuery("select * from employee");
            while(resultSet.next()) {
                System.out.println("[" + resultSet.getString("id")+" "+
                        resultSet.getString("name")+ " "+
                        resultSet.getString("address") +"]");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(null != resultSet) resultSet.close();
            if(null != stmt) stmt.close();
            if(null != connection)connection.close();

        }

        return null;
    }
}
/*
spring.datasource.driver=com.mysql.cj.jdbc.Driver
        spring.datasource.url=jdbc:mysql://localhost:3306/codexbox
        spring.datasource.username=root
        spring.datasource.password=ABHIL@sh123*/
