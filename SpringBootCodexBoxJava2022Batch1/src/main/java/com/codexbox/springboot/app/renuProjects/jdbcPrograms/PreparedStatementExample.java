package com.codexbox.springboot.app.renuProjects.jdbcPrograms;

import java.sql.*;

public class PreparedStatementExample {

    Connection connection=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    public void prepairedmethod()  {
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch1","root","renuka");
            //String str="insert into employee values(?,?,?,?)";
            preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
            preparedStatement.setInt(1,102);
            preparedStatement.setString(2,"harsha");
            preparedStatement.setLong(3,40000);
            preparedStatement.setString(4,"bchlm");
            System.out.println(preparedStatement.execute());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(resultSet!=null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                preparedStatement.close();
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
