package Assessement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        for(int i = 1; i <= 29; i++) {
            System.out.println("Enter employee " + i + " details");
            System.out.print("Enter employee name: ");
            String name = inp.next();
            System.out.print("Enter the employee id: ");
            int id = inp.nextInt();
            System.out.print("Enter the employee address: ");
            String address = inp.next();

            Employee emp = new Employee(name, id, address);
            empList.add(emp);

        }
    }
}
