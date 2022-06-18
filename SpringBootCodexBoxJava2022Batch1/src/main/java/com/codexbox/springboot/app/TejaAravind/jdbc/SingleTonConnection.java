package com.codexbox.springboot.app.TejaAravind.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingleTonConnection {
    private static Connection connection;
    private SingleTonConnection(){

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
