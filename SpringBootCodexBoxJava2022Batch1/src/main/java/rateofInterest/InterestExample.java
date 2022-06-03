package rateofInterest;

import java.util.Scanner;

public class InterestExample {
    public static  void interest(){
        double p,t,r,interest;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle :");
        p= sc.nextDouble();
        System.out.print("Enter the rate :");
        r= sc.nextDouble();
        System.out.print("Enter the months :");
        t= sc.nextDouble();
        interest= p*r*t/100;
        System.out.print("Total interest amount :"+interest);
    }
}
