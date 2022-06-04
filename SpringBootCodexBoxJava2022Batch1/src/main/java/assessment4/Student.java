package assessment4;

public class Student {
    private String sname;
    private Integer sid;
    private String saddress;

    private Integer marks;

    private Float percentage;

    private String grade;

    public void calculateGrade(Integer marks){
        if (marks > 90) {
            grade = "Grade-1";
        }
        else if ((marks > 85) && (marks < 90)) {
            grade = "Grade-2";
        } else if ((marks > 80) && (marks < 85)) {
            grade = "Grade-3";
        } else if ((marks > 70) && (marks < 80)) {
            grade = "Grade-4";
        } else if ((marks > 60) && (marks < 70)) {
            grade = "Grade-5";
        } else if ((marks > 50) && (marks < 60)) {
            grade = "Fail";
        }
    }
    public String getGrade() {
        return grade;
    }

    public  Student(String sname, Integer sid, String saddress, Integer marks, Float percentage) {
        this.sname = sname;
        this.sid = sid;
        this.saddress = saddress;
        this.marks=marks;
        this.percentage=percentage;
    }

    public String getSname() {
        return sname;
    }

    public Integer getSid() {
        return sid;
    }

    public String getSaddress() {
        return saddress;
    }

    public Integer getSmarks() {
        return marks;
    }

    public float getPercentage() {
        return percentage;
    }

}
