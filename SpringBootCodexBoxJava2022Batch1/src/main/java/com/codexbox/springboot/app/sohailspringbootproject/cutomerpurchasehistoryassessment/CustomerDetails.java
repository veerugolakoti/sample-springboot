package com.codexbox.springboot.app.sohailspringbootproject.cutomerpurchasehistoryassessment;

import com.codexbox.springboot.app.sohailspringbootproject.jdbc.SingletonConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDetails {


    ResultSet resultSet = null;
    Statement statement = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    Integer b ;
    public void getCustomerDetailsTable() throws SQLException{
        List<CustomerEntryDetails> customerDetailsList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = SingletonConnection.getConnection();
            statement = connection.createStatement();

//            statement.execute("create table CustomerDetails ( id int Primary Key,name varchar(20),aadhar int,phoneNo int ,dateofBirth varchar(40),email varchar(30),address varchar(50))");
//            statement.execute("insert into customerdetails values(1,'Sohail',123,886737,'24/09/1995','soh@gmail','Delhi')");
//            statement.execute("insert into CustomerDetails values(290,'Teja',345,886747,'24/04/1995','tej@gmail','Hyd')");
//            statement.execute("insert into CustomerDetails values(350,'Divya',567,8867357,'24/05/1995','div@gmail','Hyd')");
//            statement.execute("insert into CustomerDetails values(420,'Rajat',890,886767,'24/06/1995','raj@gmail','Delhi')");
//            statement.execute("insert into CustomerDetails values(584,'Vamshi',234,886777,'04/07/1995','vam@gmail','Vishakapatnam')");
//            statement.execute("insert into CustomerDetails values(605,'chandan',456,886787,'19/08/1995','chan@gmail','Hyd')");
//            statement.execute("insert into CustomerDetails values(705,'Abbhilash',789,886797,'20/02/1995','abhi@gmail','Bangalore')");
//            statement.execute("insert into CustomerDetails values(801,'Mounika',012,8867307,'21/11/1995','moun@gmail','hyd')");
//            statement.execute("insert into CustomerDetails values(101,'Vidya',435,88673717,'23/12/1995','vid@gmail','kolkata')");
//            statement.execute("insert into CustomerDetails values(121,'Kalyan',678,886727,'22/02/1995','kal@gmail','Delhi')");
//            String query = "  insert into CustomerDetails (id, name, aadhar, phoneNo, dateofBirth,email,address)" +
//                    "    +  values (?, ?, ?, ?, ?, ?, ?)";
            String query ="Select * from CustomerDetails;";

            resultSet = statement.executeQuery(query);



            while(resultSet.next()){
                CustomerEntryDetails customerDetails = new CustomerEntryDetails();
                 b = resultSet.getInt("id");
                customerDetails.setId(b);
                customerDetails.setName(resultSet.getString("name"));
                customerDetails.setAadhar(resultSet.getInt("aadhar"));
                customerDetails.setPhoneNo(resultSet.getInt("phoneNo"));
                customerDetails.setDateofBirth(resultSet.getString("dateofBirth"));
                customerDetails.setEmail(resultSet.getString("email"));
                customerDetails.setAddress(resultSet.getString("address"));
                customerDetailsList.add(customerDetails);
            }
                enterNewCustomerDetails();


        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Driver is not loaded : ");
            System.out.println(e.getMessage());
        }
        finally{
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (preparedStatement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
    public void enterNewCustomerDetails(){
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        String query1 ="insert into customerdetails values (? ,? , ?, ?, ?, ?, ?);";

        System.out.println("Enter the Id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Name : ");
        String name= scanner.nextLine();
        System.out.println("Enter the Aadhar number : ");
        int aadhar= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Phone number : ");
        int phoneNo = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the Date Of Birth (dd/mm/yy) : ");
        String  dateofBirth= scanner.nextLine();
        System.out.println("Enter the Email : ");
        String email= scanner.nextLine();
        System.out.println("Enter the Address : ");
        String address= scanner.nextLine();


        try {

            preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,aadhar);
            preparedStatement.setInt(4,phoneNo);
            preparedStatement.setString(5,dateofBirth);
            preparedStatement.setString(6,email);
            preparedStatement.setString(7,address);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println();

        }
    }
}
