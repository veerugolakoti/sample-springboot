package SBI_APPLICATION;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
    FileReader fileInput = null;
    FileWriter fileOutput = null;
    Scanner sc = new Scanner(System.in);
    public void signUpMethod()  {


        UserData userData = new UserData();
        System.out.println("Enter the Your Full name : ");
        userData.setName(sc.nextLine());
        System.out.println("Enter the phone number : ");
        userData.setPhoneNo(sc.nextLine());
        System.out.println("Create your user_name : ");
        userData.setUserName(sc.nextLine());
        System.out.println("Set your Password :");
        userData.setUserPassword(sc.nextLine());
        saveData(userData);



    }
    public void saveData(UserData userData){
        try {
            FileWriter writer = new FileWriter("userData1.txt");
            writer.write(userData.getName());
            writer.write("\n"+userData.getPhoneNo());
            writer.write("\n"+userData.getUserName());
            writer.write(userData.getUserPassword());
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
