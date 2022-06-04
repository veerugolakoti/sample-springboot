package com.codexbox.springboot.app.TejaAravind;

import java.util.*;

public class MyMainApp {
   /* public static void main(String[] args) {


    //int count = 1;
    List<Employee> empList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29 ; i++) {

        System.out.println("Enter Employee" + i + " Details: ");
        System.out.println("Enter emp name: ");
        String name = scanner.next();
        System.out.println("Enter emp id: ");
        Integer id = scanner.nextInt();
        System.out.println("Enter emp address: ");
        String address = scanner.next();

        Employee employee = new Employee(name, id, address);
        empList.add(employee);
    }
		System.out.println("My total employees : " + empList.size());
}*/

    /*public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            Employee employee = new Employee();
            System.out.println("Enter the Employee "+(i+1)+" details : ");
            employee.setDetails();
            list.add(employee);
        }

        for (Employee emp : list) {
            emp.display();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name you want to remove : ");
        String str = in.nextLine();
        Employee emp= new Employee();
        for (int i = 0; i < list.size();i++) {
            if (list.get(i).getName().equalsIgnoreCase(str)){
                System.out.println("Enter new employee details");
                emp.setDetails();
                list.set(i,emp);
                break;
            }
        }

        for (Employee emp1 : list) {
            emp1.display();
        }

    }*/
    public static void main(String[] args) {
        System.out.println("Welcome to Grade sorting App");
        System.out.println("Enter the number of Students : ");
        Student student = new Student();
        Scanner inp = new Scanner(System.in);

        try {
            int numOfStudents = Integer.parseInt(inp.nextLine());
            List<Student> list = new ArrayList<>(numOfStudents);
            student.setStudentDetails(list, numOfStudents);

            student.sortedList(list);

            Map<Student,String> map = new LinkedHashMap<>();
            for (Student stud : list) {
                map.put(stud,stud.getGrade());
            }
            for (Map.Entry<Student,String> item : map.entrySet()) {
                System.out.println("Student "+item.getKey().getRollNo()+ " : " +item.getValue());

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
