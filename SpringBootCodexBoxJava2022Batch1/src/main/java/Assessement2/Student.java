package Assessement2;

public class Student {
    private int no;
    private String name;
    private String address;
    private int marks;

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMarks() {
        return marks;
    }

    public static String calculateGrade(Float percentage) {
        String grade;
        if(percentage >= 90) {
            grade = "Grade-A";
        } else if(percentage > 60 && percentage < 90) {
            grade = "Grade-B";
        } else if(percentage >= 35 && percentage < 60) {
            grade = "Grade-C";
        } else {
            grade = "Fail";
        }
        return grade;
    }
}
