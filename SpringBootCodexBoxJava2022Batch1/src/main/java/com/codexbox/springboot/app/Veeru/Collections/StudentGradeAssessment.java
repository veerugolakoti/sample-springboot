package com.codexbox.springboot.app.Veeru.Collections;

import com.codexbox.springboot.app.Veeru.student.Student;

import java.util.*;

public class StudentGradeAssessment {
    private static final Integer NO_OF_SUBJECTS = 6;

    public void studentAndTheirGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total no.of student: ");
        Integer totalStudents = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < totalStudents ; i++) {

            System.out.println("Enter Student" + i + " Details: ");
            System.out.println("Enter student name: ");
            String name = scanner.next();
            System.out.println("Enter student id: ");
            Integer id = scanner.nextInt();
            System.out.println("Enter student address: ");
            String address = scanner.next();
            System.out.println("Enter student total marks");
            Integer totalMarks = scanner.nextInt();

            Student student = new Student();
            student.setStudentNum(id);
            student.setStudentName(name);
            student.setStudentAddress(address);
            student.setStudentMarks(totalMarks);
            students.add(student);
        }

        Map<Student, String> studentGradeMap = new HashMap<>();
        System.out.println("Before sorting my Student details are : ");// to test order of insertion
        for (Student student: students) {
            System.out.println("Student number: " + student.getStudentNum());
            studentGradeMap.put(student, calculateGrade((float) (student.getStudentMarks() / NO_OF_SUBJECTS)));
        }

        List<Map.Entry<Student, String>> studentAndGrades = new ArrayList<>(studentGradeMap.entrySet());
        sortStudentsByGradeAndDisplay(studentAndGrades);

    }

    public String calculateGrade(Float percentage) {
        String grade;
        if (percentage >= 90) {
            grade = "Grade1";
        } else if (percentage > 60 && percentage < 90) {
            grade = "Grade2";
        } else if (percentage >= 35 && percentage <60) {
            grade = "Grade3";
        } else {
            grade = "Grade4";
        }
        return grade;
    }

    private void sortStudentsByGradeAndDisplay(List<Map.Entry<Student, String>> studentAndGrades) {
        Collections.sort(studentAndGrades, new Comparator<Map.Entry<Student, String>>() {
            @Override
            public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
                int result = 0;
                if (o2.getValue() != o1.getValue()) {

                    result = o1.getValue().compareTo(o2.getValue());
                } else if (o1.getKey().getStudentMarks() !=  o2.getKey().getStudentMarks()) {
                    result = o2.getKey().getStudentMarks().compareTo(o1.getKey().getStudentMarks());
                } else if (o1.getKey().getStudentName() !=  o2.getKey().getStudentName()){
                    result = o1.getKey().getStudentName().compareTo(o2.getKey().getStudentName());
                } else {
                    result = o1.getKey().getStudentNum().compareTo(o2.getKey().getStudentNum());
                }
                return result;
            }
        });

        //Display Students after sorting
        System.out.println("After sorting Employee Details are");
        for (Map.Entry<Student, String> entry : studentAndGrades) {
            System.out.println("student number" + entry.getKey().getStudentNum() + " : " + entry.getValue());

        }
    }

}
