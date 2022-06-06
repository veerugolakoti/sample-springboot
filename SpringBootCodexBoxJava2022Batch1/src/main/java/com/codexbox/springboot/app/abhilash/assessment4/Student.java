package com.codexbox.springboot.app.abhilash.assessment4;

public abstract class Student {
    private Integer s_no;
    private String name;
    private String address;
    private Float marks;
    public abstract void getAllstudentDetails();

    public Float getGrade() {
        Float grade = (marks/600)*100;
        return grade;
    }

    public Student(Integer s_no, String name, String address, Float marks) {
        this.s_no = s_no;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public Student()
    {
    }

    public Integer getS_no() {
        return s_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Float getMarks() {
        return marks;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "s_no=" + s_no +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
}
