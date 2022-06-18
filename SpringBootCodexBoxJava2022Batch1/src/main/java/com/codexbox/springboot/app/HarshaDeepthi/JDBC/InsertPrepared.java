package com.codexbox.springboot.app.HarshaDeepthi.JDBC;


import java.sql.*;

public class InsertPrepared {

      public void insertPrepared() throws SQLException {
            Connection connection=null;
            PreparedStatement stmt=null;
            ResultSet resultSet=null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox","root","harsha");
                String Query="Select * from Students";
                stmt = connection.prepareStatement(Query);
                resultSet=stmt.executeQuery(Query);
                    System.out.println(resultSet.next());
                System.out.println(resultSet.getString(2));
            }catch(Exception e){
                System.out.println(e);
            }finally {
                resultSet.close();
                stmt.close();
                connection.close();
            }

        }


    }
