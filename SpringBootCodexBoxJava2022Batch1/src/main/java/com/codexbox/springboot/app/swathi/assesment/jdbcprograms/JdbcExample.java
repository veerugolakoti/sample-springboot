package com.codexbox.springboot.app.swathi.assesment.jdbcprograms;

import com.codexbox.springboot.app.Veeru.Employee;
import com.mysql.cj.protocol.Resultset;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {

       Connection connection=null;
       Statement statement = null;
       ResultSet resultset = null;
    public void Studentdetails() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/swathi2022jdbc","root","swathi123");

             statement=connection.createStatement();

             resultset = statement.executeQuery("select * from students");

            while(resultset.next()){
                System.out.println(resultset.getInt(1));
                System.out.println(resultset.getString(2));
                System.out.println(resultset.getString(3));
                System.out.println(resultset.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(null != resultset) {
                    resultset.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null !=statement)
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null != connection)

                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
   }

}
