package com.codexbox.springboot.app.codexbox.BhargavTej;
import com.codexbox.springboot.app.codexbox.Assesment3.filehandling.InputOutputStream;
import com.codexbox.springboot.app.codexbox.Assesment3.filehandling.InputOutputStreamExample2;
import org.springframework.boot.SpringApplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpringBootCodexBoxJava2022Batch1Application {
    public static void main(String[] args)  {
        SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
       /* List<CodexBoxEmployee> addEmpdetails = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<3 ;i++){
            System.out.println("Enter Employee" + i + " Details");
            System.out.println("Enter Employee " + i + " name");
            String name = scanner.nextLine();
            System.out.println("Enter Employee" + i +  " Id");
            Integer id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Employee"  +i + " Address");
            String address = scanner.nextLine();

            CodexBoxEmployee codexBoxEmployee = new CodexBoxEmployee(name,id, address);
            addEmpdetails.add(codexBoxEmployee);
        }
        for (CodexBoxEmployee cx:addEmpdetails) {
            cx.display();
        }
        System.out.print("Enter the id you want to remove: ");
        int num = scanner.nextInt();
        try
        {
            for (int i = 0; i < addEmpdetails.size(); i++) {
                if (num == addEmpdetails.get(i).getEmployeeId()){
                    addEmpdetails.remove(num);
                }



            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("enter right number to remove:"+ e);
            System.out.print("Enter the id you want to remove: ");
            num = scanner.nextInt();
        }

        for (CodexBoxEmployee cx:addEmpdetails) {
            cx.display();
        }

        System.out.println("My total employee: " + addEmpdetails.size());




       //InputStream Example
        InputOutputStream inputOutputStream = new InputOutputStream();
            inputOutputStream.fileInputOutputStream();
            */

            //InputStream Example 2
        InputOutputStreamExample2 inputOutputStreamExample2 = new InputOutputStreamExample2();
        try {
            inputOutputStreamExample2.transferFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
