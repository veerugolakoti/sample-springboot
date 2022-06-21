package com.codexbox.springboot.app.abhilash.accessingappProps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
    @Value("${name}")
    private String name;
    public void display() {
        System.out.println("name is: " + name);
    }

}
