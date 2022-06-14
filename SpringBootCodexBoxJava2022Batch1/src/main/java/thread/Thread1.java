package thread;

import java.util.Scanner;

public class Thread1 extends Thread{
Scanner sc = new Scanner(System.in);
    public void run(){
        int a = 52;
        int b = 66;
        int sum = a+b;
        System.out.println("the sum of two numbers "+sum);

        try {
            Thread.sleep(10000);
            System.out.println("enter the radius ");
            int r = sc.nextInt();
            double area = 3.14*r*r;
            System.out.println("in side run area is : "+area);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }

  }
