package SBI_APPLICATION;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SignUp {
    FileReader fileInput = null;
    FileWriter fileOutput = null;
    Scanner sc = new Scanner(System.in);
    public void signUpMethod() throws IOException {

        List<UserData> userList = new ArrayList<>();

        UserData userData=new UserData();
        System.out.println("Enter the Your Full name : ");
        userData.setName(sc.nextLine());
        System.out.println("Enter the phone number : ");
        userData.setPhoneNo(sc.nextLine());
        System.out.println("Create your user_name : ");
        userData.setUserName(sc.nextLine());
        System.out.println("Set your Password :");
        userData.setUserPassword(sc.nextLine());
        userList.add(userData);
       /* for (UserData us :userList) {
            byte[] arr = us.getName().getBytes();
            Path path = Paths.get("userdataouput.txt");
            Files.write(path,arr);

            fileOutput.append(us.getUserName());
            fileOutput.append(us.getUserPassword());
*/

        }



/*
        try {
            fileInput = new FileReader("userdata.txt");
            fileOutput =new FileWriter("userdataouput.txt");*/
           /* Path path = Paths.get("userdataouput.txt");
            for (UserData us : userList) {
                Files.write(path, Collections.singleton(us.getName()), StandardCharsets.UTF_8);

                Files.write(path, Collections.singleton(us.getPhoneNo()), StandardCharsets.UTF_8);
                Files.write(path, Collections.singleton(us.getUserName()), StandardCharsets.UTF_8);
                Files.write(path, Collections.singleton(us.getUserPassword()) ,StandardCharsets.UTF_8);
            }*/


           /* while(true)
            {
                int x=fileInput.read();
                if(x==-1)
                {
                    break;
                }
                fileOutput.write(x);
            }*/





      /*  } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }*/
}
