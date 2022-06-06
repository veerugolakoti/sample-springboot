package com.codexbox.springboot.app.sohailspringbootproject.assessment;

public class Student {

        String name;
        Integer id;
    Integer marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }


    public String getGrade(){
        if (marks>=90){
            return "G1";
        }
        else if (marks>=60 ) {
            return "G2";
        }
        else if  (marks>=35){
            return "G3";
        }
        else {
            return "G4";
        }

    }

    }



