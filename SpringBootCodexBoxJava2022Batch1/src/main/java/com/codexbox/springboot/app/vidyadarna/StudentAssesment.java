package com.codexbox.springboot.app.vidyadarna;

public class StudentAssesment {
    private  String studentName;
    private  String studentAddress;
    private Integer studentId;
    private Float studentMarks;

    public static String entrySet() {
        return null;
    }
    // private String studentGrade;



//    public StudentAssesment(String studentName, String studentAddress, Integer studentId, float studentMarks,String studentGrade){
//        this.studentName = studentName;
//        this.studentAddress = studentAddress;
//        this.studentId = studentId;
//        this.studentMarks = studentMarks;
//        this.studentGrade = studentGrade;
//    }


    public <studentName> String getStudentName(String studentName) {
        return studentName;
    }

    public String getStudentAddress(String studentAddress) {
        return studentAddress;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentMarks(Float studentMarks) {
        this.studentMarks = studentMarks;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Float getStudentMarks() {
        return studentMarks;
    }
    public String getStudentGrade(String  studentGrade) {
        return studentGrade;
    }



//    public  void display(){
//        System.out.println("studentName\t " + "studentAddress\t "+ "studentId\t" + "studentMarks\t "+ "studentGrade\t");
//        System.out.println(" studentName\t : " +getStudentName()+  " studentAddress\t : " + getStudentAddress()+ " studentId \t  " + getStudentId()+ " studentMarks  "  + getStudentMarks() + "  studentGrade\t  "+getStudentGrade());
//    }
}
