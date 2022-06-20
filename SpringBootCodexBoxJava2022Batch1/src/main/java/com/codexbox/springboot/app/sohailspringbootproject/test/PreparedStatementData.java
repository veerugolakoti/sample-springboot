package com.codexbox.springboot.app.sohailspringbootproject.test;

import org.springframework.boot.autoconfigure.amqp.AbstractConnectionFactoryConfigurer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementData {
    Connection connection ;
    PreparedStatement preparedStatement;

    public void getPreparedData() throws SQLException, ClassNotFoundException {

        DataBaseSingletonConnection dataBaseSingletonConnection =DataBaseSingletonConnection.getdataBaseSingletonConnection();


        connection =dataBaseSingletonConnection.getConnection();
        String query = "insert into student values (? ,? , ?)";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 45);
            preparedStatement.setString(2, "Sohail");
            preparedStatement.setInt(3, 95);
            preparedStatement.executeQuery();
        } catch
        (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(preparedStatement!=null){
                preparedStatement.close();

            }
            if(connection!=null){
                connection.close();
            }
        }
    }
}
