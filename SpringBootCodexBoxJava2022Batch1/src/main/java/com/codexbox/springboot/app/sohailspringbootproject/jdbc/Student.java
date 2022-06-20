package com.codexbox.springboot.app.sohailspringbootproject.jdbc;

public class Student {
    private int student_id;
    private String student_name;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_marks() {
        return student_marks;
    }

    public void setStudent_marks(int student_marks) {
        this.student_marks = student_marks;
    }

    private int student_marks;

}
