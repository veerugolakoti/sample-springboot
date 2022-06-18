package com.codexbox.springboot.app.rehana.customepurchaseHistory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDemographicTable {
    public static void main(String[] args) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rehana_schema","root","Choti@123");
          String query ="create table customer("
                  +"customer Id INTEGER NOT NULL,"
                  +"name VARCHAR(255),"
                  +"Aadhar number BIGINT ,"
                  +"phone number BIGINT ,"
                  +"Date of birth VARCHAR(20),"
                  +"Email VARCHAR(50) ,"
                  +"Address VARCHAR(50),"
                  +"PRIMARY KEY (customer_id))";
          preparedStatement =  connection.prepareStatement(query);
          preparedStatement.execute();
          System.out.println("customer demographic tabel is created");
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }finally {
          preparedStatement.close();
          connection.close();

      }


  }
}
