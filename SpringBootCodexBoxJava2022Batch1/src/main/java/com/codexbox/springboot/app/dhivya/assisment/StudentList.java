package com.codexbox.springboot.app.dhivya.assisment;

public class StudentList {
    private static final int totalmarks = 600;
    private float average;
    private Integer studno;
    private String studName;
    private String studAddress;
    private Integer studMarks;

    public Integer getStudno() {
        return studno;
    }

    public void setStudno(Integer studno) {
        this.studno = studno;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudAddress() {
        return studAddress;
    }

    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }

    public Integer getStudMarks() {
        return studMarks;
    }


    public void setStudMarks(Integer studMarks) {
        this.studMarks = studMarks;
    }

    String s1;


    public String setAverage() {
        this.average = (int)(studMarks*(100) / totalmarks);
        if (average > 90) {
            s1 = "grade1";
        }
        if (average >= 60 && average < 90) {
            s1 = "grade2";
        }
        if (average >= 35 && average < 60) {
            s1 = "grade3";
        }
        if (average < 35) {
            s1 = "grade4";
        }
        return s1;
    }

    public void details() {
        System.out.println("----------------------------------");
        System.out.println(this.studno + " " + this.studName + " " + this.studAddress + " " + this.studMarks + " " + this.s1);
    }
}