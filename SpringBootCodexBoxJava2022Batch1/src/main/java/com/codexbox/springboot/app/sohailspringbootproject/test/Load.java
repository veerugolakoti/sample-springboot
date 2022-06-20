package com.codexbox.springboot.app.sohailspringbootproject.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class Load {
    @Value ("${datasource.driver}")
    private  String driver ;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void loadMethod(){
        System.out.println(driver);
    }
}
