package feature_ranjan.assignement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AssignementCollection {
    public void collectionAssign(){
        List<EmpDetails> empList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee details:");



        for(int i=1; i<=2; i++){
            EmpDetails empObj1 = new EmpDetails();
            System.out.println("enter id:"+i);
            empObj1.setEmpId(sc.nextInt());
            System.out.println("enter name:");
            empObj1.setEmpName(sc.next());
            System.out.println("enter address:");
            empObj1.setEmpAdd(sc.next());

            empList.add(empObj1);
        }
        for(EmpDetails emp: empList) {
            emp.empMethod();

        }


        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the absent employee name u want to remove :");
        String str = sc2.nextLine();
        EmpDetails empObj2 = new EmpDetails();

        for(int i = 0; i <empList.size(); i++) {
            if (empList.get(i).getEmpId().equals(str)) {
                System.out.println("enter the emp details :");
                empObj2.setEmpId(i);
                empList.set(i, empObj2);

            }break;
        }
        for(EmpDetails emp: empList) {
            emp.empMethod();

        }
    }
}
