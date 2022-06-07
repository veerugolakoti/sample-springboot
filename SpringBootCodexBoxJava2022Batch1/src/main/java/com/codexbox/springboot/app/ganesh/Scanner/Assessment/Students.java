package com.codexbox.springboot.app.ganesh.Scanner.Assessment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private int Studentnumber;
    private String Studentname,Studentaddress;
    private String result;
    private Float  percentage;
    private  int marks;

    private int getStudentnumber() {
        return Studentnumber;
    }



    public String getStudentname() {
        return Studentname;
    }



    public String getStudentaddress() {
        return Studentaddress;
    }



    public String getResult() {
        return result;
    }


    public int getMarks() {
        return marks;
    }



    public Float getPercentage() {
        return percentage;
    }



   public Students(int Studentnumber, String Studentname, String Studentaddress, int marks ) {


       this.Studentnumber = Studentnumber;
       this.Studentname = Studentname;
       this.Studentaddress = Studentaddress;
       this.marks = marks;
   }
//
//    public Students (){
//
//    }
//





    public String calculategrade(int marks){
        percentage= (float) marks/6; //type casting int - float

        if (percentage >90)
        {
            result="Grade1";
        }

        else if(percentage <90 && percentage>60)
        {
            result ="Grade2";
        }
        else if(percentage <60 && percentage>35)
        {
            result ="Grade3";
        }
        else
        {
            result ="fail";
        }

        System.out.println(" percentage ="+percentage);
        System.out.println("Result= "+result);

         return result;
    }
}






