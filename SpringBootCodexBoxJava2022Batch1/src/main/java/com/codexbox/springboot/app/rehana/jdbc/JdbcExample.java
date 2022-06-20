package com.codexbox.springboot.app.rehana.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public void studentDeatils() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehana_schema","root","Choti@123");
            String query ="select * from student";
             statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            List<StudentEx> lists = new ArrayList<>();
            while (resultSet.next()){
                StudentEx studentEx = new StudentEx();
                studentEx.setId(resultSet.getInt("id"));
                studentEx.setStudent_name(resultSet.getString("student_name"));
                studentEx.setFirstname(resultSet.getString("firstname"));
                studentEx.setAddress(resultSet.getString("address"));
                studentEx.setCity(resultSet.getString("city"));
                lists.add(studentEx);
            }
            for (StudentEx list: lists) {
                System.out.println(list.getId());
                System.out.println(list.getStudent_name());
                System.out.println(list.getFirstname());
                System.out.println(list.getAddress());
                System.out.println(list.getCity());

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
          if( resultSet!=null) resultSet.close();
          if(statement!=null) statement.close();
          if(connection!=null){
          connection.close();

        }

    }


}}
