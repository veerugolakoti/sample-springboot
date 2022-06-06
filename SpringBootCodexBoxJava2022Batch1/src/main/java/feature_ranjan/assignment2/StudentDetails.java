package feature_ranjan.assignment2;

public class StudentDetails {
    private Integer studentNo;
    private String studentName;

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Integer getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(Integer studentMark) {
        this.studentMark = studentMark;
    }

    private String studentAddress;
    private Integer studentMark;

    private String studentGrade;

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }


    public String grade(){
        if(studentMark >= 90){
            studentGrade = "G1";
            return "G1";
        }else
        if(studentMark >=60){
            studentGrade = "G2";
            return "G2";
        }else
        if(studentMark>=35) {
            studentGrade = "G3";
            return "G3";
        }
            return "G4";
    }

    public void studentDetails(){
    System.out.println("sno :"+studentNo);
    System.out.println("sname :"+studentName);
    System.out.println("saddress :"+studentAddress);
    System.out.println("smark :"+studentMark);
    System.out.println("sgrade :"+studentGrade);
}
}
