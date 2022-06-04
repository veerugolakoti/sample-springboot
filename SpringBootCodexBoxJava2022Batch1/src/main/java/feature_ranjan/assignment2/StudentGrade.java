package feature_ranjan.assignment2;

import java.util.*;

public class StudentGrade {
    public void studentGrade(){
        List<StudentDetails> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student details:");

        for(int i=1; i<=2; i++){

            StudentDetails stdDetailsObj = new StudentDetails();
            System.out.print("Enter the Student id :");
            stdDetailsObj.setStudentNo(scanner.nextInt());

            System.out.print("Enter the Student name :");
            stdDetailsObj.setStudentName(scanner.next());

            System.out.print("Enter the Student address :");
            stdDetailsObj.setStudentAddress(scanner.next());

            System.out.print("Enter the Student mark :");
            stdDetailsObj.setStudentMark(scanner.nextInt());

            stdDetailsObj.grade();
            studentList.add(stdDetailsObj);
        }
        for (StudentDetails str0:studentList) {
            str0.studentDetails();
        }


        Collections.sort(studentList, new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {

                if(o1.getStudentGrade().equalsIgnoreCase(o2.getStudentGrade())){
                    return o1.getStudentName().compareTo(o2.getStudentName());
                }

                if(o1.getStudentMark() == (o2.getStudentMark())){
                    return o1.getStudentNo().compareTo(o2.getStudentNo());
                }
                if(o2.getStudentName().equalsIgnoreCase(o1.getStudentName())){
                    return o2.getStudentMark().compareTo(o1.getStudentMark());
                }
                return o1.getStudentGrade().compareTo(o2.getStudentGrade());
            }
        });

    }
}
