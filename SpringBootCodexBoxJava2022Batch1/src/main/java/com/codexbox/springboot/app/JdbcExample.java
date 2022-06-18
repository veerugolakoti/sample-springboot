package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.collections.StudentExample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    Connection connection = null;
    //Statement statement=null;
    ResultSet resultSet = null;

   PreparedStatement preparedStatement=null;

    CallableStatement statement=null;

    public  void StudentExample() throws SQLException {

            try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch1", "root", "Ammulu@123");


                String query = "select*from student where stdid = ? and std_name=?";

                statement = (CallableStatement) connection.createStatement();
                preparedStatement=connection.prepareStatement(query);
               preparedStatement.setInt(1,2);
           preparedStatement.setString(2,"b");

                statement.setInt(1,2);
               statement.setString(2,"b");
                statement= connection.prepareCall(query);


                resultSet = statement.executeQuery();


                List<StudentExample> studentExamples = new ArrayList<>();
                while (resultSet.next()) {
                    StudentExample studentExample = new StudentExample();
                    studentExample.setName( resultSet.getString("std_name"));
                    studentExample.setId(resultSet.getInt("stdid"));
                    studentExample.setMarks(resultSet.getLong("std_marks"));
                    studentExamples.add(studentExample);
                }
                for (StudentExample list: studentExamples) {
                    System.out.println(list.getId());
                    System.out.println(list.getName());
                    System.out.println(list.getMarks());
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            catch(SQLException e) {
                    throw new RuntimeException(e);
                }finally{
                if(null!=resultSet)
                resultSet.close();
                if(null!=preparedStatement)
                preparedStatement.close();
                connection.close();

            }

        }

    }




