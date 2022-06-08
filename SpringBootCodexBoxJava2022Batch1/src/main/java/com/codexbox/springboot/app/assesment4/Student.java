package com.codexbox.springboot.app.assesment4;

import org.springframework.core.annotation.Order;

import java.util.*;

public class Student {
    private static final int TOTAL_MARKS = 600;

    private Integer studentid;
    private String studentname;
    private String studentaddress;
    private Integer studentmarks;
    private String grade;

    public Integer getStudentid() {
        return studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public Integer getStudentmarks() {
        return studentmarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }


    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }


    public void setStudentmarks(Integer studentmarks) {
        this.studentmarks = studentmarks;
    }

    public void details() {
        System.out.println(this.studentid);
        System.out.println(this.studentname);
        System.out.println(this.studentaddress);
        System.out.println(this.studentmarks);

    }

    public void caluclate() {
        if (this.studentmarks >= 90) {
            this.grade = "G1";
            System.out.println("the grade :G1");

        } else if ((this.studentmarks > 60)) {
            this.grade = "G2";
            System.out.println("the grade :G2");

        } else if ((this.studentmarks >= 35)) {

            this.grade = "G3";
            System.out.println("the grade :G3");

        } else if ((this.studentmarks == 35)) {
            this.grade = "G4";
            System.out.println("the grade :G4");

        }

    }

    public static void sortedlist(List<Student> lists) {
        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGrade().equalsIgnoreCase(o2.getGrade())) {
                    if (o2.getStudentname().equalsIgnoreCase(o1.getStudentname())) {
                        if (Objects.equals(o2.getStudentmarks(), o1.getStudentmarks())) {
                            return o1.getStudentid().compareTo(o2.studentid);
                        }
                        return o2.getStudentmarks().compareTo(o1.studentmarks);
                    }

                    return o1.getStudentname().compareTo(o2.getStudentname());
                }
                return o1.getGrade().compareTo(o2.getGrade());
            }
        });
        System.out.println("after sorting student details: ");
        Map<Student,String> map = new HashMap<>();
        for (Student std : lists) {
            map.put(std,std.getGrade());
        }
        for (Map.Entry<Student, String> entry :map.entrySet()) {
            System.out.println("student id no:"+entry.getKey().getStudentid()+": with grade:"+entry.getValue());

        }


    }
}



















