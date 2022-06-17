package com.codexbox.springboot.app.vamshi.jdbc;


import java.sql.*;

public class SamplePreparedStatment {
    Connection connection=null;
    PreparedStatement statement=null;
    ResultSet resultSet=null;

    public void getBatchdetails() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavabatch4", "root", "vamshi@V2");
            String query = "select * from javabatch4";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println(
                        resultSet.getInt("personID")+"  "+
                                resultSet.getString("LastName")+""+
                                resultSet.getString("FirstName")+"  "+
                                resultSet.getString("Address")+"  "+
                                resultSet.getString("City"));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(null!=resultSet)
                resultSet.close();
            if(null!=statement)
                statement.close();
            if (null!=connection)
                connection.close();
        }

    }

}
