package springbootnag.MainMethod;

import com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.nag.AddEmployees;
import springboot.nag.collections.HashSetOperations;
import springboot.nag.collections.StackOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
       /* SpringApplication.run(com.codexbox.springboot.app.SpringBootCodexBoxJava2022Batch1Application.class, args);
        List<AddEmployees> employee = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 29; i++) {
            System.out.println("Enter employee " + i + " details ");
            System.out.println("Enter employee id ");
            Integer id = sc.nextInt();
            System.out.println("Enter employee name ");
            String name = sc.next();
            System.out.println("Enter employee address ");
            String address = sc.next();
            AddEmployees addEmployess = new AddEmployees(id, name, address);
            employee.add(addEmployess);
        }
//            System.out.println("My total employee details "+employee.size());

//            for (AddEmployees ade : employee) {
        for (int i=0;i<=employee.size();i++) {
            employee.get(i).display();
        }

            employee.remove(1);

        for (int i=0;i<=employee.size();i++) {
            employee.get(i).display();
        }


                *//*System.out.println("enter absent employee id");
                Object o = sc.next();
                employee.remove(o);
//            System.out.println("preset employees are");


//                System.out.println("My absent employee size is " + employee.size());
            }
        System.out.println("My absent employee size is " + employee.size());


        System.out.println("My present employee size is "+employee.size());*//*
    }
}*/
        /*StackOperations so = new StackOperations();
        so.testoperations();*/
        HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();
    }
}

