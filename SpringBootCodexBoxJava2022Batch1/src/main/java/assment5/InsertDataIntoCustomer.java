package assment5;

import java.sql.*;
import java.util.Scanner;

public class InsertDataIntoCustomer {
    Scanner sc = new Scanner(System.in);
    Connection connection = null;


    PreparedStatement preparedStatement = null;

    public void insertData() throws SQLException {
        System.out.println("Enter the Total customers");
        int TotalNumbers = sc.nextInt();
        for (int i = 1; i <= TotalNumbers; i++) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox", "root", "ramesh");
                String query1 = "insert into customer values(?,?,?,?,?,?);";
                preparedStatement = connection.prepareStatement(query1);
                System.out.println("customer number "+i);
                System.out.println("Enter the customer id");
                int id = sc.nextInt();
                System.out.println("Enter the customer name");
                String name = sc.next();
                System.out.println("Enter the Date of Brith");
                String dob = sc.next();
                System.out.println("Enter the Address");
                String Address = sc.next();
                System.out.println("Enter the phone number");
                int phno = sc.nextInt();
                System.out.println("Enter the gmail id");
                String gmailid = sc.next();

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, dob);
                preparedStatement.setString(4, Address);
                preparedStatement.setInt(5, phno);
                preparedStatement.setString(6, gmailid);
                preparedStatement.execute();
                System.out.println("successfully Completed **");


            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
            finally {
                if (null != preparedStatement) {
                    preparedStatement.close();
                }
                if (null != connection) {
                    connection.close();
                }


            }

        }

    }
}
