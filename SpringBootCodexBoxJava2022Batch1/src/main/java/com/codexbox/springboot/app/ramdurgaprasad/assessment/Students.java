package com.codexbox.springboot.app.ramdurgaprasad.assessment;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;

public class Students {

    private String id;
    private  String name;
    private String address;
    private  Integer marks;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRollno() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getMarks() {
        return marks;
    }

    public String grades(){
        try{
            if (this.marks>=90 && this.marks<=100) {
                this.grade = "o";
                System.out.println("grade O-(outstanding)");
                return "grade O-(outstanding)";
            } else if (this.marks>=80&&this.marks<=89){
                this.grade="A";
                System.out.println("grade A-(very good)");
                return ("grade A-(very good)");
            } else  if (this.marks>=70&&this.marks<=79){
                this.grade="B";
                System.out.println("grade B-(good)");
                return ("grade B-(good)");
            }
            else if (this.marks>=60&&this.marks<=69) {
                this.grade="C";
                System.out.println("the grade C-(average)");
                return ("the grade C-(average)");
            } else if (this.marks>=35&&this.marks<=59){
                this.grade="D";
                System.out.println("grade D-(justpass)");
                return ("grade D-(justpass)");
            } else  if (this.marks<=34&& this.marks>=0)
            { this.grade="F";
                System.out.println("grade f-fail");
                return ("grade f-fail");
            }
            throw new InputMismatchException("inputmismatch exception");
        } catch (Exception exp){
            System.out.println("input mismatch exception occured ");

        }
        return grade;
    }
    public void displaydetails(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.marks);
    }
    public void setRollno(String rollno) {
        this.id = rollno;
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
    public void sortedlist(List<Students> list) {
        list.sort(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o2.getMarks()==o1.getMarks()){
                if (o1.getGrade().equalsIgnoreCase(o2.getGrade())) {
                    if (o2.getName().equalsIgnoreCase(o1.getName())) {

                            return o1.getRollno().compareTo(o2.getRollno());
                        }
                        return o1.getName().compareTo(o2.getName());
                    }
                    return o1.getGrade().compareTo(o2.getGrade());

                }
                return (o2.getMarks().compareTo(o1.getMarks()));
            }
        });
        System.out.println("after sorting the students by grade");
        for (Students stud : list) {
            stud.grades();
        }

        return ;
    }
    }

