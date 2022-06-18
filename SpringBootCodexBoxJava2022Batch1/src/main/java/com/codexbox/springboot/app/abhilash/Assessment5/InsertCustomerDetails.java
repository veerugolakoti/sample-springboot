package com.codexbox.springboot.app.abhilash.Assessment5;

import com.codexbox.springboot.app.abhilash.JdbcExample.EnterCustoomerDetails;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertCustomerDetails {
    public void insertCustomers() {
//        System.out.println("Enter number of customers want to insert:");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
        try {
            for (int i = 0; i < 10; i++) {
                EnterCustoomerDetails enterCustoomerDetails = new EnterCustoomerDetails();
                enterCustoomerDetails.enterdetails();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
           /*catch (SQLException e) {
            System.out.println("Your entry is already exist.");
            System.out.println("enter valid details:");
               EnterCustoomerDetails enterCustoomerDetails = new EnterCustoomerDetails();
               enterCustoomerDetails.enterdetails();
        }*/
    }
}
