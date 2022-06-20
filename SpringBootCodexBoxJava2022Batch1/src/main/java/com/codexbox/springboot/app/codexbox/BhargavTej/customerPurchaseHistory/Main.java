package com.codexbox.springboot.app.codexbox.BhargavTej.customerPurchaseHistory;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Scanner;

@SpringBootApplication

public class Main {
    public static void main(String[] args) throws SQLException {


//        CreateTable createTable = new CreateTable();
//        createTable.creationOfTable();

        SampleExample sampleExample = new SampleExample();
        sampleExample.testMethod();


//        InsertDetails insertDetails = new InsertDetails();
//        try {
//            insertDetails.insertionDetails();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
}
