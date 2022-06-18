package com.codexbox.springboot.app.renuProjects.asessment2;

import java.sql.*;

public class Customer_Demography_Details {

    Connection connection=null;
    Statement statement=null;
    //ResultSet resultSet=null;
    public void customerTable(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_batch1","root","renuka");
            statement=connection.createStatement();
            String str="create table customer_details(customer_id bigint primary key,customer_name varchar(20),customer_email varchar(50) unique key,adhar_no bigint unique key,ph_no bigint(10) unique key,customer_DOB varchar(20),address varchar(20) unique key)";
            statement.execute(str);
            System.out.println("created table");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
