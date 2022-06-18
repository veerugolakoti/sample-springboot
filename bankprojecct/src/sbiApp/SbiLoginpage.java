package sbiApp;

import java.io.IOException;
import java.util.Scanner;

public class SbiLoginpage {

    public void loginDetails() throws IOException {
        Scanner sc= new Scanner(System.in);

        System.out.println("1--SignIn");
        System.out.println("2--SignUp");
        int a=sc.nextInt();

        if(a==1)
        {
            SignIn signIn = new SignIn();
            signIn.signInMethod();

        } else if (a==2) {
            SignUp signUp = new SignUp();
            signUp.signUpMethod();
        }else {
            System.out.println(" choose correct option ");
        }


    }

}
