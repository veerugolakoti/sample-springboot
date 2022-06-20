package com.codexbox.springboot.app.vidyadarna.coustmerPercheasDetails_Assesment;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CodexDataBaseSingleTon {
    private static CodexDataBaseSingleTon dataConnection ;
    static Connection connection = null;
@Value("${datasource.driver}")
    public String driver;

    @Value("${datasource.user.name}")
    public String userName;

    @Value("${datasource.password}")
    public  String password;

    @Value("${datasource.url}")
    public String url;

    public CodexDataBaseSingleTon(){


//      this.driver = driver;
//        this.userName = userName;
//        this.password = password;
//        this.url = url;
    }
    @Bean
public static CodexDataBaseSingleTon getCodexDataBaseSingleTon() {
        if (dataConnection == null) {
            dataConnection = new CodexDataBaseSingleTon();
        }
         return dataConnection;
    }
    @Bean
public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection==null)
        Class.forName(driver);
       return   DriverManager.getConnection(url,userName,password);
    }
}
