package Assessement2;

import java.util.*;

public class MainMethod {
    public static void main(String[] args) {

        final int TOTAL_SUBJECTS = 6;

            List<Student> studentList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                Student student = new Student();
                System.out.print("Enter the number: ");
                int no = input.nextInt();
                System.out.print("Enter the name: ");
                String name = input.next();
                System.out.print("Enter the address: ");
                String address = input.next();
                System.out.print("Enter the marks: ");
                int marks = input.nextInt();

                student.setNo(no);
                student.setName(name);
                student.setAddress(address);
                student.setMarks(marks);

                studentList.add(student);
            }

            System.out.println("Before sorting: ");
            for (Student students : studentList) {
                System.out.println(students.getNo() + " " + students.getName() + " " + students.getMarks() + " " + students.getAddress() + " " + Student.calculateGrade((float) students.getMarks()/TOTAL_SUBJECTS));
            }

        }
}
