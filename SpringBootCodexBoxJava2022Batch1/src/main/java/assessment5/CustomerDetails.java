package assessment5;

import java.sql.*;
import java.util.Scanner;

public class CustomerDetails {
    public void myCustomerDetails() throws SQLException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of customer details do you print ");
        int number= sc.nextInt();
        Integer id=null;
        String name=null;
        String address=null;
        String aadhar=null;
        String phone=null;
        String dob=null;
        for (int i=0;i < number;i++) {
            System.out.println("enter customer id : ");
            id = sc.nextInt();
            System.out.println("enter name : ");
            name = sc.next();
            System.out.println("enter address : ");
            address = sc.next();
            System.out.println("enter aadharNumber : ");
            aadhar = sc.next();
            System.out.println("enter phoneNumber : ");
            phone = sc.next();
            System.out.println("enter DateOfBirth : ");
            dob = sc.next();
        }

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox-schema","root","kalyan1818@");

            String sql="insert into customer values(?,?,?,?,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setString(4,aadhar);
            preparedStatement.setString(5,phone);
            preparedStatement.setString(6,dob);

            int i=preparedStatement.executeUpdate();
            System.out.println(i+ " update new employee");

            /*String sql = "CREATE TABLE CUSTOMER,(Id INTEGER not NULL,Name VARCHAR(255),Address VARCHAR(255),AadharNO INTEGER unique,PhoneNo INTEGER unique,DateOfBirth date,PRIMARY KEY ( Id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");*/

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("you are entered element is duplicate and Try again ");
            CustomerDetails customerDetails=new CustomerDetails();
            customerDetails.myCustomerDetails();
        }
        finally {
           if (resultSet != null)resultSet.close();
            if (null !=preparedStatement)preparedStatement.close();
            if (null !=connection)connection.close();
        }

    }
}
