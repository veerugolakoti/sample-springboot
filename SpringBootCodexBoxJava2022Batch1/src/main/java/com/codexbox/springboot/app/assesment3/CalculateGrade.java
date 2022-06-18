package com.codexbox.springboot.app.assesment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateGrade {
   public String method() {

        // public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String grade=null;

       for (int i = 1; i <= 3; i++) {

           List<StudentClass> student = new ArrayList<>();

                System.out.println("enter the number");
                Integer no = sc.nextInt();
                System.out.println("enter the name");
                String name = sc.next();
                System.out.println("enter the adress");
                String adress = sc.next();
                System.out.println("enter the marks");
                float marks = sc.nextInt();

                if (marks>90){

                     grade="grade1";

                }
           else if (marks>60&&marks<=90) {
                grade="grade2";

            }
           else if(marks>=35&&marks<=60) {
                grade = "grade3";
            }  {

                }
             if (marks<35){
                grade="garde4";
            }
                StudentClass std = new StudentClass(no, name, adress, marks,grade);
                student.add(std);

                for (StudentClass stdk : student) {
                    System.out.println(std.getNo() + " " + (std.getName() + " " + (std.getAdress() + " " + (std.getMarks() +" "+(std.getGrade())))));

                }


            }
       return null;
   }
    }



