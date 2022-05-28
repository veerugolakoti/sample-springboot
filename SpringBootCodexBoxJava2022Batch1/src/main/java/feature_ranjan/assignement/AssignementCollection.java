package feature_ranjan.assignement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AssignementCollection {
    public void collectionAssign(){
        List<EmpDetails> empList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee details:");

        EmpDetails empDitelsObj = new EmpDetails();

        for(int i=0; i<29; i++){
            System.out.println("enter id:"+i);
            empDitelsObj.setEmpId(sc.nextInt());
            System.out.println("enter name:");
            empDitelsObj.setEmpName(sc.next());
            System.out.println("enter address:");
            empDitelsObj.setEmpAdd(sc.next());

            empList.add(empDitelsObj);
        }


        for (EmpDetails empDetails: empList) {
            empDetails.empDataDisplay();

        }
    }
}
