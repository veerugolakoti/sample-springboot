package CustemerAssessment;

import java.sql.*;
import java.util.Scanner;

public class CustomerDetails {
   public void createCustomerDetails(){

       Connection connection= null;
       PreparedStatement statement=null;

       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexboxbatch_1","root","@nagarjuna");
           String query="insert into customer values(?,?,?,?,?,?,?)";
         statement= connection.prepareStatement(query);
           Scanner sc=new Scanner(System.in);
           System.out.println("enter customet id");
           int id= sc.nextInt();
           System.out.println("enter customer name");
           String name=sc.next();
           System.out.println("enter customer address");
           String address=sc.next();
           System.out.println("enter customer aadhar number");
           int aadhar=sc.nextInt();
           System.out.println("enter customer phone number");
           int phonenumber=sc.nextInt();
           System.out.println("enter customer date of birth");
           String dob=sc.next();
           System.out.println("enter customer email");
           String email=sc.next();

           statement.setInt(1,id);
           statement.setString(2,name);
           statement.setString(3,address);
           statement.setInt(4,aadhar);
           statement.setInt(5,phonenumber);
           statement.setString(6,dob);
           statement.setString(7,email);


        statement.executeUpdate();
           System.out.println("completed");


       } catch (SQLIntegrityConstraintViolationException e1){
           System.out.println("my customer id is duplicated");
       } catch (ClassNotFoundException | SQLException e) {
           throw new RuntimeException(e);
       } finally {
           try {
               statement.close();
               connection.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }


   }
}
