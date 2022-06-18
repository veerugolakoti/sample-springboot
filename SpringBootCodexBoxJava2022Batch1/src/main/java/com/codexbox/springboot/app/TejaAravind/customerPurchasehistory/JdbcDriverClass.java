package com.codexbox.springboot.app.TejaAravind.customerPurchasehistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcDriverClass {
    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;
    Scanner in = new Scanner(System.in);

    public List<CustomerHistoryData> getCustomerdetails() {
        List<CustomerHistoryData> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = SingletonConnection.getConnection();
            /*String query = "CREATE TABLE `customerdata` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `name` VARCHAR(45) NOT NULL,\n" +
                    "  `aadharNo` BIGINT NOT NULL,\n" +
                    "  `phoneNo` BIGINT NULL,\n" +
                    "  `dateOfBirth` VARCHAR(45) NOT NULL,\n" +
                    "  `emailId` VARCHAR(45) NULL,\n" +
                    "  `address` VARCHAR(200) NULL,\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,\n" +
                    "  UNIQUE INDEX `aadharNo_UNIQUE` (`aadharNo` ASC) VISIBLE,\n" +
                    "  UNIQUE INDEX `phoneNo_UNIQUE` (`phoneNo` ASC) VISIBLE,\n" +
                    "  UNIQUE INDEX `emailId_UNIQUE` (`emailId` ASC) VISIBLE);";*/
            // String query = "insert into customerpurchasehistory values (2,'sohail',34672334874367,6434667764,'12-01-2001','sohail@gmail.com','hyd');";
//            String query = "SELECT * FROM codexsample.customerpurchasehistory;";
            insertIntoDB();


//            resultSet = statement.executeQuery();

           /*while (resultSet.next()){
                CustomerHistoryData customerData = new CustomerHistoryData();
                customerData.setId(resultSet.getInt("id"));
                customerData.setName(resultSet.getString("name"));
                customerData.setAadharNo(resultSet.getLong("aadharNo"));
                customerData.setPhoneNo(resultSet.getLong("phoneNo"));
                customerData.setDateOfBirth(resultSet.getString("dateOfBirth"));
                customerData.setEmail(resultSet.getString("emailId"));
                customerData.setAddress(resultSet.getString("address"));
                list.add(customerData);
            }*/

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return list;

    }

    public void insertIntoDB() throws SQLException {
        System.out.println("Enter the no of customers : ");
        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your Id : ");
            Integer id = Integer.parseInt(in.nextLine());
           while (checkInDb(id)){
               System.out.println("Duplicate id. please enter a id again");
                id = Integer.parseInt(in.nextLine());
            }
            System.out.println("Enter your name : ");
            String name = in.nextLine();
            System.out.println("Enter your aadharNo : ");
            Long aadharNo = Long.parseLong(in.nextLine());
            while (checkInDb(aadharNo, "aadharNo")){
                System.out.println("Duplicate aadharNo.Enter a aadharNo again");
                aadharNo = Long.parseLong(in.nextLine());
            }
            System.out.println("Enter your phoneNo : ");
            Long phoneNo = Long.parseLong(in.nextLine());
            while (checkInDb(phoneNo, "phoneNo")){
                System.out.println("Duplicate phoneNo.Enter a phoneNo again");
                phoneNo = Long.parseLong(in.nextLine());
            }
            System.out.println("Enter your date of birth : ");
            String dateOfBirth = in.nextLine();
            System.out.println("Enter your email id : ");
            String email = in.nextLine();
            while (checkInDb(email, "emailId")){
                System.out.println("Duplicate email.Enter a email again");
                email = in.nextLine();
            }
            System.out.println("Enter your address : ");
            String address = in.nextLine();
            String query = "insert into customerpurchasehistory values (?,?,?,?,?,?,?);";
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setLong(3, aadharNo);
            statement.setLong(4, phoneNo);
            statement.setString(5, dateOfBirth);
            statement.setString(6, email);
            statement.setString(7, address);
            statement.execute();
        }


    }
    public boolean checkInDb(Integer value) throws SQLException {
        List<Integer> list = new ArrayList<>();
        String query = "SELECT id FROM codexsample.customerpurchasehistory;";
        statement = connection.prepareStatement(query);
        resultSet = statement.executeQuery();

        while (resultSet.next()){
           list.add(resultSet.getInt("id"));
        }
         return list.contains(value);
    }
    public boolean checkInDb(Long value, String name) throws SQLException {
        List<Long> list = new ArrayList<>();
        String query = "SELECT aadharNo,phoneNo FROM codexsample.customerpurchasehistory;";
        statement = connection.prepareStatement(query);
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            list.add(resultSet.getLong(name));
        }
        return list.contains(value);

    }
    public boolean checkInDb(String value, String name) throws SQLException {
        List<String> list = new ArrayList<>();
        String query = "SELECT emailId FROM codexsample.customerpurchasehistory;";
        statement = connection.prepareStatement(query);
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            list.add(resultSet.getString(name));
        }
        return list.contains(value);

    }


}
