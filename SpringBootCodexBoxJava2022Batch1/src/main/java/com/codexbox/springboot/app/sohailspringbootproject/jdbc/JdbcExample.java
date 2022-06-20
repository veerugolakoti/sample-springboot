package com.codexbox.springboot.app.sohailspringbootproject.jdbc;

import com.codexbox.springboot.app.sohailspringbootproject.test.DataBaseSingletonConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {
    public void jdbcMethod() throws SQLException {
        ResultSet resultSet=null;
        Statement statement = null ;
        Connection connection = null;
        try {
//            1.Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
//            2.Get the connection
            DataBaseSingletonConnection dataBaseSingletonConnection = DataBaseSingletonConnection.getdataBaseSingletonConnection();
          dataBaseSingletonConnection.getConnection();
//            3.create statement
            String query = "select * from student";
            statement =  connection.createStatement();
//            4.Execute a statement

//            5.Resultset
            resultSet = statement.executeQuery(query);
            List<Student> studentlist = new ArrayList<>();

            while(resultSet.next()){
                Student student = new Student();
                student.setStudent_id(resultSet.getInt("student_id"));
                student.setStudent_name(resultSet.getString("student_name"));
                student.setStudent_marks(resultSet.getInt("student_marks"));
                studentlist.add(student);
            }
            for (Student list:studentlist) {
                System.out.println(list.getStudent_id());
                System.out.println(list.getStudent_name());
                System.out.println(list.getStudent_marks());
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally{

            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        }
    }
}
