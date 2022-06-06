package feature_ranjan.assignment2;

import com.codexbox.springboot.app.Veeru.student.Student;

import java.util.*;

public class StudentGrade {
    private static final Integer NO_OF_SUBJECT = 6;
    public void studentGrade(){
        List<StudentDetails> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Integer totalStudent = scanner.nextInt();
        System.out.println("Enter the Student details:");

        for(int i=0; i<=totalStudent; i++){

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

        Map<StudentDetails, String> studentGradeMap = new HashMap<>();
        System.out.println("Before Sorting ");
        for (StudentDetails str0:studentList) {
            str0.studentDetails();
            studentGradeMap.put(str0, calculateGrade((float)(str0.getStudentMark() / NO_OF_SUBJECT)));
        }
        List<Map.Entry<StudentDetails,String>> studentListGrade = new ArrayList<>(studentGradeMap.entrySet());

    }
    public String calculateGrade(Float percentage) {
        String grade;
        if (percentage >= 90) {
            grade = "Grade1";
        } else if (percentage > 60 && percentage < 90) {
            grade = "Grade2";
        } else if (percentage >= 35 && percentage < 60) {
            grade = "Grade3";
        } else {
            grade = "Grade4";
        }
        return grade;
    }
    public void sortByGrade(List<Map.Entry<StudentDetails, String>> studentListGrade){
        Collections.sort(studentListGrade, new Comparator<Map.Entry<StudentDetails, String>>() {
            @Override
            public int compare(Map.Entry<StudentDetails, String> o1, Map.Entry<StudentDetails, String> o2) {

                int result = 0;
                if (o2.getValue() != o1.getValue()) {

                    result = o1.getValue().compareTo(o2.getValue());
                } else if (o1.getKey().getStudentMark() !=  o2.getKey().getStudentMark()) {
                    result = o2.getKey().getStudentMark().compareTo(o1.getKey().getStudentMark());
                } else if (o1.getKey().getStudentName() !=  o2.getKey().getStudentName()){
                    result = o1.getKey().getStudentName().compareTo(o2.getKey().getStudentName());
                } else {
                    result = o1.getKey().getStudentNo().compareTo(o2.getKey().getStudentNo());
                }
                return result;
            }
        });
        System.out.println("After sorting Employee Details are");
        for (Map.Entry<StudentDetails, String> entry : studentListGrade) {
            System.out.println("student number" + entry.getKey().getStudentNo() + " : " + entry.getValue());
        }


    }
}
