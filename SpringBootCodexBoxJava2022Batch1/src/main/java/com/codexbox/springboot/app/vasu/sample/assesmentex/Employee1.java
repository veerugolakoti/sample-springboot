package com.codexbox.springboot.app.vasu.sample.assesmentex;

import java.util.Scanner;

public class Employee1 {
    private String Name;
    private int Id;
    private String Address;

    public void provideDetails(){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter Employee name: ");
       this.Name= obj.nextLine();
       System.out.println("Enter Employee id: ");
       this.Id=obj.nextInt();
       System.out.println("Enter Employee Address: ");
       this.Address=obj.nextLine();

    }
   public void DisplayDetails(){
       System.out.println("================");
       System.out.println("Employee Details");
       System.out.println("Name: " + Name);
       System.out.println("Id: " + Id);
       System.out.println("Address:" + Address);
       System.out.println();

    }
    /*public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public String getAddress() {
        return Address;
    }

*/

}
