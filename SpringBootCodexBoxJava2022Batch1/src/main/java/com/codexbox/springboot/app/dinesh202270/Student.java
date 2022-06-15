package com.codexbox.springboot.app.dinesh202270;

public class Student {

    private Integer ID;
    private String name;

    private String grade;

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public Integer getID() {
        return ID;
    }


    private String address;
    private Float marks;




/*

    static final int TOTALMARKS=600;
    public Student(){}

     String grade=null;

    public Student(int ID, String name, String address, float marks, String s) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.marks = marks;
        this.grade=s;
*/


    public void studentDetails() {

        System.out.println(ID + "     " + name + "     " + address + "    " +  marks + "     " + grade);

    }


}
