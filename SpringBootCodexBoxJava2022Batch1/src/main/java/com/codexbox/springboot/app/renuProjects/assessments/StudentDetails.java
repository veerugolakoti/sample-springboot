package com.codexbox.springboot.app.renuProjects.assessments;

public class StudentDetails {

    private int studentnum;
    private String name;
    private String adress;
    private int marks;
    private String grade;



    public StudentDetails(int studentnum, String name, String adress, int marks,String grade) {
        this.studentnum = studentnum;
        this.name = name;
        this.adress = adress;
        this.marks = marks;
        this.grade=grade;
    }

    public int getStudentnum() {
        return studentnum;
    }

    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }

    public String getGrade() {
        return grade;
    }

    public int getMarks() {
        return marks;
    }



}
