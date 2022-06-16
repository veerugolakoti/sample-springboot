package com.codexbox.springboot.app.Assesment;

import java.util.Scanner;

  public class Student {
      Integer studentid;
      String studentname;
      String studentaddres;
      Integer studentmarks;
      String grade;

      public String getGrade() {
          return grade;
      }

      void calculate(){
         int percentage  = studentmarks*100/600;
         if (percentage>=90){
             this.grade = "grade 1";
         } else if (percentage>60 && percentage<90) {
             this.grade = "grade 2";
         } else if (percentage>35 && percentage<60) {
             this.grade = "grade 3";
         }
         else {
             this.grade = "grade 4";
         }
    }


      public Integer getStudentid() {
          return studentid;
      }

      public String getStudentname() {
          return studentname;
      }

      public String getStudentaddres() {
          return studentaddres;
      }

      public Integer getStudentmarks() {
          return studentmarks;
      }
      public Student(int id,String name,String addres,int marks){
          this.studentid = id;
          this.studentname = name;
          this.studentaddres = addres;
          this.studentmarks = marks;
      }
      public void display(){
          System.out.println("student id:"+ studentid);
          System.out.println("student name:"+ studentname);
          System.out.println("student address:"+ studentaddres);
          System.out.println("student marks:"+ studentmarks);
          System.out.println("student grade:"+ grade);
          System.out.println("&&&&&&&&&&&&&&&&&&&&&");
      }
  }












