package com.codexbox.springboot.app.swathi.assesment.assessment5;

import java.sql.*;
import java.util.Scanner;

public class InsertionData {
    Connection connection = null;
      PreparedStatement statement = null;
      public  void insertmethod(){
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swathi2022jdbc","root","swathi123");
              String query = "insert into customerstable values(?,?,?,?,?,?,?)";
              statement =connection.prepareStatement(query);

              Scanner input =new Scanner(System.in);
              for(int i=0;i<1;i++) {


                  System.out.println("enter the id :");
                  int id = input.nextInt();
                  statement.setInt(1, id);


                  System.out.println("enter the name :");
                  String name = input.next();
                  statement.setString(2, name);

                  System.out.println("enter the address :");
                  String address = input.next();
                  statement.setString(3, address);

                  System.out.println("aadhar : ");
                  String aadhar = input.next();
                  statement.setString(4, aadhar);

                  System.out.println("phonenumber : ");
                  int phonenumber = input.nextInt();
                  statement.setInt(5, phonenumber);

                  System.out.println(" dob : ");
                  String dob = input.next();
                  statement.setString(6, dob);

                  System.out.println("email : ");
                  String email = input.next();
                  statement.setString(7, email);
                  statement.execute();
                 // System.out.println("rows inserted successfully");
              }
          } catch (ClassNotFoundException e) {
              throw new RuntimeException(e);
          } catch(SQLIntegrityConstraintViolationException e){
              System.out.println("id is repeated please re enter");
          } catch (SQLException e){
                  throw new RuntimeException(e);
          }
      }

    }

