package com.codexbox.springboot.app.studentdetails;

public class StudentList {

 private static final int  totalmarks= 600;
 
    private float average;
    private String studentId;
    private String studentAddress;
    private Integer studentMarks;
    private String studentName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Integer getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Integer studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    String st;


    public String setAverage() {
        this.average = (int)(studentMarks*(100) / totalmarks);
        if(average>90){
            st="grade 1";
        }
        if(average >=60 && average<90){
            st="grade 2";
        }
        if(average>=35 && average<60){
            st="grade 3";
        }
        if(average<35){
            st=" grade 4";
        }
        return st;
    }
     public void details(){
         System.out.println(this.studentName + " " + this.studentId + " " + this.studentAddress + " " + this.studentMarks);
     }


    public void add(StudentList studentList) {
    }
}














