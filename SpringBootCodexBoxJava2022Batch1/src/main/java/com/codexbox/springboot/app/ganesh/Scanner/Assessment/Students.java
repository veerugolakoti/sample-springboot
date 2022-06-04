package com.codexbox.springboot.app.ganesh.Scanner.Assessment;

public class Students {
  private int Studentnumber;
  private String Studentname,Studentaddress;
    private String result;
    private Float marks,percentage;

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


    public Float getMarks() {
        return marks;
    }




    public Float getPercentage() {
        return percentage;
    }



    public Students(int Studentnumber, String Studentname, String Studentaddress, Float marks ) {


        this.Studentnumber = Studentnumber;
        this.Studentname = Studentname;
        this.Studentaddress = Studentaddress;
        this.marks = marks;

    }
//
//    {
//        List<Students> order = new LinkedList<>();
//        Scanner s = new Scanner(System.in);
//        for (int i = 1; i <= 6; i++) {
//            System.out.println("==========Enter the Students "+i+" Details============");
//            System.out.println("Enter the Students numbeer");
//            Studentnumber = s.nextInt();
//            System.out.println("Enter the Students name");
//        Studentname  =s.next();
//            System.out.println("Enter the Students address");
//            Studentaddress   =s.next();
//           System.out.println("Enter the Students marks");
//             marks = s.nextFloat();
//        }
//        Students st = new Students(Studentnumber,Studentname,Studentaddress,marks);
//        order.add(Students);
//    }
public void calculate(int marks){
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
    } else if (percentage<35)
    {
    result ="fail";
        }
    System.out.println(" percentage ="+percentage);
    System.out.println("Result= "+result);
}

}






