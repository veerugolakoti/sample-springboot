package com.codexbox.springboot.app.swathi.assesment.Assessment3;

public class Student {

    String name;
    String no;
    String address;
    String marks;

    public Student(String name, String no, String address, String marks) {
        this.name = name;
        this.no = no;
        this.address = address;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public String getAddress() {
        return address;
    }

    public String getMarks() {
        return marks;
    }

    public void studentmethod() {
        System.out.println("student name \t  student no \t student address \t student marks");
        System.out.println(name + "\t" + no + "\t" + address + "\t" + marks);
    }

  public String studentgrade(int marks) {
        if (marks >= 90) {
            return "G1";
        }
else if(marks>=60){
    return  "G2";
        }
else if (marks>=35) {
    return  "G3";

        }
else {
    return "G4";
        }
    }
}





