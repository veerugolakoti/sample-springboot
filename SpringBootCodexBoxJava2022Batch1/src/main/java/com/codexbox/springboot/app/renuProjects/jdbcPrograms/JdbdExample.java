package com.codexbox.springboot.app.renuProjects.jdbcPrograms;

import java.sql.*;

public class JdbdExample {
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    public void jdbcmethod(){
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch1","root","renuka");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from employee");
            while (resultSet.next()){
                System.out.print(resultSet.getInt(1)+" \t");
                System.out.print(resultSet.getString(2)+" \t");
                System.out.print(resultSet.getLong(3)+" \t");
                System.out.print(resultSet.getString(4)+" \n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }finally {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

}
