package sbiApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SignIn {

    Scanner sc = new Scanner(System.in);

    public void signInMethod(){
        System.out.println("Enter your username : ");
        String username=sc.nextLine();
        System.out.println("Enter your password : ");
        String userpassword=sc.nextLine();
        try {
            FileReader fileReader = new FileReader("userData1.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Boolean checkUser = false;
            String data = bufferedReader.readLine();
            while (data != null) {
                if (username.concat(userpassword).equals(data)) {
                  checkUser =true;
                }
                data = bufferedReader.readLine();

            }

            if(checkUser){
                System.out.println("Welcome to SBI Home Page ");

            }else {
                System.out.println("Invalid login credentials.");
            }
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
