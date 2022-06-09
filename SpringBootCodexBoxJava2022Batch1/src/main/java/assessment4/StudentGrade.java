package assessment4;

import java.util.*;

public class StudentGrade {
    private static final Integer NO_OF_SUBJECTS = 6;

    public void studentGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no of student: ");
        Integer totalStudents = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < totalStudents ; i++) {
            System.out.println("Enter Student" + i + " Details: ");
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter student id: ");
            Integer id = sc.nextInt();
            System.out.println("Enter student address: ");
            String address = sc.next();
            System.out.println("Enter student total marks:");
            Integer totalMarks = sc.nextInt();

            Student student = new Student(id,name,address,totalMarks);
            students.add(student);
        }

        Map<Student, String> studentGrade = new HashMap<>();
        System.out.println(">>>>>Before sorting<<<<< : ");
        for (Student student: students) {
            System.out.println("Student number: " +student.getStdNo());
            studentGrade.put(student, calculateGrade((float) (student.getStdMarks() / NO_OF_SUBJECTS)));
        }
        List<Map.Entry<Student, String>> studentGrades = new ArrayList<>(studentGrade.entrySet());
        sortStudentsGrade(studentGrades);

    }

    public String calculateGrade(Float percentage) {
        String grade;
        if (percentage >= 90) {
            grade = "Grade-A";
        } else if (percentage > 60 && percentage < 90) {
            grade = "Grade-B";
        } else if (percentage >= 35 && percentage <60) {
            grade = "Grade-C";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    private void sortStudentsGrade(List<Map.Entry<Student, String>> studentGrades) {
        Collections.sort(studentGrades, new Comparator<Map.Entry<Student, String>>() {
            @Override
            public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
                int result = 0;
                if (o2.getValue() != o1.getValue()) {

                    result = o1.getValue().compareTo(o2.getValue());
                } else if (o1.getKey().getStdMarks() != o2.getKey().getStdMarks()) {
                    result = o2.getKey().getStdMarks().compareTo(o1.getKey().getStdMarks());
                } else if (o2.getKey().getStdName().equalsIgnoreCase( o1.getKey().getStdName())){
                    result = o1.getKey().getStdName().compareTo(o2.getKey().getStdName());
                } else {
                    result = o1.getKey().getStdNo().compareTo(o2.getKey().getStdNo());
                }
                return result;
            }
        });

        System.out.println(">>>>>>After sorting <<<<<<");
        for (Map.Entry<Student, String> entry : studentGrades) {
            System.out.println("student number : " + entry.getKey().getStdNo() + " : " + entry.getValue());

        }
    }

}

