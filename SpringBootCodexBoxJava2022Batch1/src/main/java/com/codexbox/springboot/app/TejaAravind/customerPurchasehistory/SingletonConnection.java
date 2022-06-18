package com.codexbox.springboot.app.TejaAravind.customerPurchasehistory;

import java.sql.*;

public class SingletonConnection {
    private static Connection connection;

    private SingletonConnection(){

    }
    public static Connection getConnection(){
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codexsample","root","teja@codex");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;

    }

}
