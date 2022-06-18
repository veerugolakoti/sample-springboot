package com.codexbox.springboot.app.TejaAravind.assessment;

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
        MyStudent student = new MyStudent();
        Scanner inp = new Scanner(System.in);

        try {
            int numOfStudents = Integer.parseInt(inp.nextLine());
            List<MyStudent> list = new ArrayList<>(numOfStudents);
            student.setStudentDetails(list, numOfStudents);

            student.sortedList(list);

            Map<MyStudent,String> map = new LinkedHashMap<>();
            for (MyStudent stud : list) {
                map.put(stud,stud.getGrade());
            }
            for (Map.Entry<MyStudent,String> item : map.entrySet()) {
                System.out.println("Student "+item.getKey().getRollNo()+ " : " +item.getValue());

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   /* public static void main(String[] args) {

        System.out.println(EnumsPractice.SPRING);
        for (EnumsPractice e : EnumsPractice.values()) {
            System.out.println(e +"  "+ e.getValue());

        }
    }*/

    public static class MyStudent {
        private Integer rollNo;
        private String name;
        private String address;
        private Integer marks;
        private String grade;
        private static final Integer totalMarks = 600;

        public void setStudentDetails(List<MyStudent> list, int numOfStudents) {
            Scanner inp = new Scanner(System.in);
            for (int i = 0; i < numOfStudents;i++) {
                MyStudent student = new MyStudent();
                System.out.println("Enter the Student "+(i+1)+ " Details");
                System.out.println("Enter the Student Roll No : ");
                student.setRollNo(Integer.parseInt(inp.nextLine()));
                System.out.println("Enter the Student Name : ");
                student.setName(inp.nextLine());
                System.out.println("Enter the Student Address : ");
                student.setAddress(inp.nextLine());
                System.out.println("Enter the Student marks out of 600 : ");
                int marks = Integer.parseInt(inp.nextLine());
                student.setMarks(marks);
                student.calculateGrade(student.getMarks());
                list.add(student);
            }
            System.out.println("Before Sorting : ");
            for (MyStudent student : list) {
                student.display();
            }
        }

        public void sortedList(List<MyStudent> list) {
            list.sort(new Comparator<MyStudent>() {
                @Override
                public int compare(MyStudent o1, MyStudent o2) {
                    if (o1.getGrade().equalsIgnoreCase(o2.getGrade())) {
                        if (o2.getName().equalsIgnoreCase(o1.getName())) {
                            if (Objects.equals(o2.getMarks(), o1.getMarks())){
                                return o1.getRollNo().compareTo(o2.getRollNo());
                            }
                            return o2.getMarks().compareTo(o1.getMarks());
                        }
                        return o1.getName().compareTo(o2.getName());
                    }
                    return o1.getGrade().compareTo(o2.getGrade());

                }
            });

            System.out.println("After Sorting");
            for (MyStudent stud : list) {
                stud.display();
            }
        }

        public String calculateGrade(Integer marks){
            marks = (marks * 100) / totalMarks;
            if(marks >= 90){
                this.grade =  "G1";
                return "G1";
            }
            if(marks > 60){
                this.grade = "G2";
                return "G2";
            }
            if(marks >= 35){
                this.grade =  "G3";
                return "G3";
            }

            this.grade =  "G4";
            return "G4";

        }
        public void display(){
            System.out.println("Student " + this.name + " details ");
            System.out.println("Student Roll No : " + this.rollNo);
            System.out.println("Student Name : " + this.name);
            System.out.println("Student Address : " + this.address);
            System.out.println("Student Marks : " + this.marks);
            System.out.println("Student Grade : " + this.grade);
            System.out.println();
        }

        public String getGrade() {
            return grade;
        }

        public Integer getRollNo() {
            return rollNo;
        }

        public void setRollNo(Integer rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }
    }
}
