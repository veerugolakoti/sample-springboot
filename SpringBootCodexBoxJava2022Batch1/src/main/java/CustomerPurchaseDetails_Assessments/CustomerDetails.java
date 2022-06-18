package CustomerPurchaseDetails_Assessments;

import java.sql.*;
import java.util.Scanner;

public class CustomerDetails {
    Connection connection = null;
    PreparedStatement statement = null;
    public void customerDetails() {
        try {
            Scanner input = new Scanner(System.in);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexbox_java", "root", "shiva");
            String query = "insert into customersdetails values (? , ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);

            System.out.print("Enter the customer id: ");
            int customerId = input.nextInt();
            statement.setInt(1, customerId);

            System.out.print("Enter customer name: ");
            String customerName = input.next();
            statement.setString(2, customerName);

            System.out.print("Enter customer address: ");
            String address = input.next();
            statement.setString(3, address);

            System.out.print("Enter Date of birth: ");
            String dob = input.next();
            statement.setString(4, dob);

            System.out.print("Enter aadhar number: ");
            long aadhar = input.nextLong();
            statement.setLong(5, aadhar);

            System.out.print("Enter email address: ");
            String email = input.next();
            statement.setString(6, email);

            System.out.print("Enter phone number: ");
            long phone_no = input.nextLong();
            statement.setLong(7, phone_no);

            statement.executeUpdate();
            System.out.println("Rows inserted successfully");

        } catch (SQLIntegrityConstraintViolationException w) {
            System.out.println("You entered the input is already exists.... Enter a different input");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(null != statement) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(null != statement) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
