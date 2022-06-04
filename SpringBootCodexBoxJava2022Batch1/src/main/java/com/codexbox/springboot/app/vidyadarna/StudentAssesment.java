package com.codexbox.springboot.app.vidyadarna;

public class StudentAssesment {
    private  String studentName;
    private  String studentAddress;
    private Integer studentId;
    private Float studentMarks;
   private String studentGrade;



    public StudentAssesment(String studentName, String studentAddress, Integer studentId, float studentMarks,String studentGrade){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentId = studentId;
        this.studentMarks = studentMarks;
        this.studentGrade = studentGrade;
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

    public Float getStudentMarks() {
        return studentMarks;
    }
    public String getStudentGrade() {
        return studentGrade;
    }
    public  void display(){
        System.out.println("studentName\t " + "studentAddress\t "+ "studentId\t" + "studentMarks\t "+ "studentGrade\t");
        System.out.println(" studentName\t : " +getStudentName()+  " studentAddress\t : " + getStudentAddress()+ " studentId \t  " + getStudentId()+ " studentMarks  "  + getStudentMarks() + "  studentGrade\t  "+getStudentGrade());
    }
}
