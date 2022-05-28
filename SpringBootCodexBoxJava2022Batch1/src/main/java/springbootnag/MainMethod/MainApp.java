package springbootnag.MainMethod;

import com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.nag.AddEmployees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MainApp {




    public static void main(String[] args) {
        SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
        List<AddEmployees> employee=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=29;i++) {
            System.out.println("Enter employee " + i + " details ");
            System.out.println("Enter employee id ");
            Integer id=sc.nextInt();
            System.out.println("Enter employee name ");
            String name=sc.next();
            System.out.println("Enter employee address ");
            String address=sc.next();
            AddEmployees addEmployess=new AddEmployees(id,name,address);
            employee.add(addEmployess);
            System.out.println("My total employee details "+employee.size());

        }
    }
}