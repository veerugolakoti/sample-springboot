package com.codexbox.springboot.app.TejaAravind.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@ConfigurationProperties
//@PropertySource("classpath:application.properties")
public class JdbcDynamicExample {
    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;
    @Value("${datasource.driver}")
    public String driver;


    public void test(){
        System.out.println(driver);
       ConnectionSingleton connectionSingleton = ConnectionSingleton.getConnectionSingleton();
        try {
            connection = connectionSingleton.getDatabaseConnection();
            String query =  "select * from codexsample.customerpurchasehistory;";
            statement =  connection.prepareStatement(query);
            resultSet = statement.executeQuery();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {

                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }



}
