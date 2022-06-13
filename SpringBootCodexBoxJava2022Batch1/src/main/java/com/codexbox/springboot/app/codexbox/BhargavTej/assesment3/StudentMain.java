package com.codexbox.springboot.app.codexbox.BhargavTej.assesment3;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> StudentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <4; i++) {
            System.out.println("Enter Student "+ i +"Details");
            System.out.println("Enter Student  name");
            String name = scanner.next();
            System.out.println("Enter Student  address");
            String address = scanner.next();
            System.out.println("Enter Student  id");
            int id = scanner.nextInt();
            System.out.println("Enter Student Total marks of A Semster");
            int marks = scanner.nextInt();

            Student student = new Student(name, address, id, marks);

            student.gradeCalculation();
            StudentList.add(student);
        }
        for (Student student: StudentList) {
            student.dataDisplay();
        }
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGrade().equals(o2.getGrade())){
                    if (o2.getStudentName().equalsIgnoreCase(o1.getStudentName())){
                        if (o1.getStudentmarks()==o2.getStudentmarks()){

                            return o1.getStudentId().compareTo(o2.getStudentId());
                        }
                        return o1.getStudentName().compareTo(o2.getStudentName());
                    }
                    return o2.getStudentmarks().compareTo(o1.getStudentmarks());
                }
                return o1.getGrade().compareTo(o2.getGrade());
            }
        });
        System.out.println("After sorting");
        for (Student student: StudentList) {
            student.dataDisplay();
        }
        Map<Student,Character> gradeStudent = new HashMap<>();
        for (Student student:StudentList) {
            gradeStudent.put(student, student.getGrade());
        }
        for (Map.Entry<Student,Character> vr:gradeStudent.entrySet()) {
            System.out.println("Student id " + vr.getKey().getStudentId() + "  grade acquired :" + vr.getValue());
        }
        }
    }
