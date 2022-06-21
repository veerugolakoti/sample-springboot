package com.codexbox.springboot.app.abhilash.accessingappProps;

import com.codexbox.springboot.app.abhilash.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewClass {
    private static Person employee;

    public NewClass(Person employee) {
        this.employee = employee;
    }

    public static  void main(String[] args) {
        SpringApplication.run(NewClass.class, args);
        employee.display();
    }

}
