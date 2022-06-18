package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

//        CreateTable createTable = new CreateTable();
//        createTable.creationOfTable();

        InsertDetails insertDetails = new InsertDetails();
        try {
            insertDetails.insertionDetails();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
