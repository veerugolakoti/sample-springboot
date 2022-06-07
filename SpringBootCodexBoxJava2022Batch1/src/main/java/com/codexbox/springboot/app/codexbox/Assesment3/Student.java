package com.codexbox.springboot.app.codexbox.Assesment3;

public class Student {
    private String studentName;
    private String studentAddress;
    private Integer studentId;
    private Integer studentmarks;

    private Character grade;

    static final int totalmarks=600;

    public Student(String name, String address, int id, int marks) {
        this.studentName = name;
        this.studentAddress = address;
        this.studentId = id;
        this.studentmarks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getStudentmarks() {
        return studentmarks;
    }

    public Character getGrade() { return grade; }

    public void dataDisplay() {
        System.out.println( "studentName : " + studentName);
        System.out.println("studentAddress  is :" + studentAddress);
        System.out.println("studentId is :" + studentId);
        System.out.println("studentmarks is :" + studentmarks);

    }

    public char  gradeCalculation() {
//        int totalMarks = 600;
        double percentage;

        percentage = (studentmarks *100 )/ totalmarks;

        if (percentage >= 90) {
            this.grade = 'A';
        } else if (percentage > 60 && percentage < 90) {
            this.grade = 'B';
        } else if (percentage >= 35 && percentage < 60) {
            this.grade = 'C';
        } else {
            this.grade = 'D';
        }
        return  grade;

    }
}



