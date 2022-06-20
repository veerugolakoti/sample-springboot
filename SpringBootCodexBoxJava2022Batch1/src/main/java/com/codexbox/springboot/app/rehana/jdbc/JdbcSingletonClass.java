package com.codexbox.springboot.app.rehana.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static javax.swing.text.html.parser.DTDConstants.ID;

public class JdbcSingletonClass {
   Connection connection = null;
    PreparedStatement pstmnt = null;
    public void test(){

      SingletoneDataBaseConnection singletoneDataBaseConnection = SingletoneDataBaseConnection.singletoneDataBaseConnection();
        try {
            singletoneDataBaseConnection.getSingletoneDataBaseConnection();
            String qurey = "insert into rehana_schema.employee(?,?,?,?)";
            connection.prepareStatement(qurey);
            pstmnt.setInt(1,2);
            pstmnt.setString(2,"a");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

