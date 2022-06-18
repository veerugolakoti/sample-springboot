package com.codexbox.springboot.app.ramdurgaprasad.assessment6;

import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerInputs {
    public static void main(String[] args) {
        CustomerDetails customerDetails = new CustomerDetails();
        for (int i = 0; i < 4; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("====:Please enter your details to get started and correct details should be correct:====");
            System.out.println("Enter the your id:");
            customerDetails.setId(scanner.nextInt());
            System.out.println("Enter your name as per the aadhaar:  ");
            customerDetails.setCustomerName(scanner.next());
            System.out.println("Enter your aadhaar number");
            customerDetails.setAadhaarNumber(scanner.nextLong());
            System.out.println("Please provide your phone number:");
            customerDetails.setPhoneNumber(scanner.nextLong());
            System.out.println("Please provide your date of the birth as per aadhaar card");
            customerDetails.setDateOfBirth(scanner.next());
            System.out.println(" Enter your email for further updates");
            customerDetails.setCustomerEmail(scanner.next());
            System.out.println("Enter the correct address for further product deliveries ");
            customerDetails.setGetCustomerAddress(scanner.next());
            System.out.println("========:Thank you for providing your details:========= ");
            PreparedStatement statement = null;
            Connection conn = null;

            try {
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplecode", "root", "Hitm@n0808");
//
                String sql = "INSERT INTO REGISTRATION(id,customer_name,aadhaar_number,phone_number,date_of_birth,customer_email,getCustomer_address) "
                        + "VALUES(?,?,?,?,?,?,?)";
               statement = conn.prepareStatement(sql);

                try {
                    statement.setInt(1, customerDetails.getId());
                }catch(DuplicateKeyException e){
                    System.out.println("customer id is already exists:");
                }
                statement.setString(2, customerDetails.getCustomerName());
                try{
                statement.setLong(3, customerDetails.getAadhaarNumber());
                }catch(DuplicateKeyException e){
                    System.out.println("customer AadhaarNumber is already exists:");
                }try {

                    statement.setLong(4, customerDetails.getPhoneNumber());
                }catch (DuplicateKeyException e){
                    System.out.println("customer PhoneNumber is already exists:");
                }
                statement.setString(5, customerDetails.getDateOfBirth());
                try {
                    statement.setString(6, customerDetails.getCustomerEmail());
                }catch (DuplicateKeyException e){
                    System.out.println(" CustomerEmail is already exists:");
                }
                statement.setString(7, customerDetails.getGetCustomerAddress());
                statement.executeUpdate();

            }catch (SQLException e) {
                System.out.println("Sorry for inconvinence :__The customer details you have entered is _==already exists==_ please provide correct details __ ");
            }
            }
        }
    }
