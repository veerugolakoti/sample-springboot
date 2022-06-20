package com.codexbox.springboot.app.TejaAravind.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Properties;

/*@ConfigurationProperties
@PropertySource("classpath:application.properties")*/
@Configuration
public class Sangam{


   /* @Value("${datasource.driver}")
    public String driver;*/
   @Value("Hi everyone")
   public String driver;

    @Value("${datasource.url}")
    public String url;

   /*public void getvalue() {
        Properties properties = new Properties();
        try {
            InputStream reader = getClass().getClassLoader().getResourceAsStream("application.properties");
            properties.load(reader);
            System.out.println(properties.getProperty("datasource.url"));
            System.out.println(properties.getProperty("datasource.driver"));
            System.out.println(properties.getProperty("datasource.user.name"));
            System.out.println(properties.getProperty("datasource.password"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
*/
    }







