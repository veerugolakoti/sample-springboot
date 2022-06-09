package com.codexbox.springboot.app.assesment3;

public class StudentClass {

    private int no;
    private String name;
    private String adress;
    private float marks;
   private String grade;





    public StudentClass(int no, String name, String adress, float marks,String grade) {
        this.no = no;
        this.name = name;
        this.adress = adress;
        this.marks = marks;
        this.grade=grade;
    }

    public StudentClass(int no, String name, String adress,String marks,String grade) {

    }

    public StudentClass() {

    }

    public int getNo() {
        return no;
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

    public float getMarks() {
        return marks;


    }
}

