package com.codexbox.springboot.app.ravalispringboot.assesment3;

public class Student {
    String sname;
    int sno;
    String saddress;
    int marks;

    String grade;

    float percantage;

    String Calculator;

    public Student() {

    }


    public Student(String sname, int sno, String saddress, int marks) {
        this.sname = sname;
        this.sno = sno;
        this.saddress = saddress;
        this.marks = marks;
    }

    public String getSname() {
        return sname;
    }

    public int getSno() {
        return sno;
    }

    public String getSaddress() {
        return saddress;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public void Calculator() {
      float grade = (marks * 100 / 600);
        if (grade > 90) {
          //  System.out.println( "G1");
          this.grade = "G1";
        } else if (grade > 60 && grade < 90) {
           // System.out.println(" G2");
            this.grade = "G2";
        } else if (grade > 35 && grade < 60) {
            //System.out.println(" G3 ");
            this.grade = "G3";
        }
        else {
            //System.out.println( " G4");
           // this.grade = "G4";
        }

    }
}





