package com.codexbox.springboot.app.swathi.assesment.assessment5;

import java.sql.*;

public class CustomerTable {
  public void customermethod(){
        Connection connection=null;
        Statement statement=null;
       // ResultSet resultSet=null;*/

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swathi2022jdbc","root","swathi123");

            statement= connection.createStatement();

            String query="create table customersTable(c_id int(10) primary key, customer_name varchar(30), address varchar(30), aadhar varchar(30) unique key, phone_number int(10) unique key,dob varchar(30),email varchar(30) unique key);";

            statement.executeUpdate(query);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                   /*throw new RuntimeException(e);*/
                    System.out.println("alredy exist");

                }
            }
        }

    }

}

