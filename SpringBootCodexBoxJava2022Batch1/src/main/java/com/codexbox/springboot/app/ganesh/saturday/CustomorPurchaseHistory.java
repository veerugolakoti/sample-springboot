package com.codexbox.springboot.app.ganesh.saturday;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomorPurchaseHistory {
    public void custmordemographicdetails() throws SQLException {
        Logic logic = new Logic();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of customer");
        int noc = s.nextInt();

        try {

            logic.service(noc);
        } catch (SQLException e) {
            System.out.println("data is duplicated. enter the new data of customer");
            Logic logic1 = new Logic();
            logic1.service(noc);

        }


    }
}