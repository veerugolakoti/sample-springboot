package com.codexbox.springboot.app.sohailspringbootproject.test;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
/*    PreparedStatementData preparedStatementData = new PreparedStatementData();
        try {
            preparedStatementData.getPreparedData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        Load load = new Load();
        load.loadMethod();

    }

}
