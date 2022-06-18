package customerpurchasehistory;

import java.sql.*;
import java.util.Scanner;

public class InsertDetails {
    public void customerdetails() {
        int id;
        String name;
        long aadhar;
        long phone;
        String dob;
        String mail;
        String adress;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
         id = sc.nextInt();
        System.out.println("enter the name");
        name = sc.next();
        System.out.println("enter the aadher");
        aadhar = sc.nextLong();
        System.out.println("enter the phone ");
        phone = sc.nextLong();
        System.out.println("enter the dob");
        dob = sc.next();
        System.out.println("enter the mail ");
        mail = sc.next();
        System.out.println("enter the adress");
        adress = sc.next();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva_sql","root","Siva@9999");
        String sql = "Insert into customer_table VALUES (?,?,?,?,?,?,?)";
                PreparedStatement p1 = conn.prepareStatement(sql);
                p1.setInt(1,id);
                p1.setString(2,name);
                p1.setLong(3,aadhar);
                p1.setLong(4,phone);
                p1.setString(5,dob);
                p1.setString(6,mail);
                p1.setString(7,adress);
                p1.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}




