package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ramdurgaprasad.assessment.Students;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
 class RamdurgaprasadTestUnit {


    @ Test
    public void method(){
        Students students=new Students();
        Scanner scanner=new Scanner(System.in);
        int Student =scanner.nextInt();
        try {
            if(Student>=10){
                System.out.println("the number of students :"+Student);
            }}catch(Exception ex){
            System.out.println("you have entered the above max limit so there is an exception");

            }
        }


    }



