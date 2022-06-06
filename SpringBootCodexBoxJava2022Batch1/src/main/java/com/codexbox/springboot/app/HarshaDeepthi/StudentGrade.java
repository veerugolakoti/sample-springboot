package com.codexbox.springboot.app.HarshaDeepthi;


import com.codexbox.springboot.app.HarshaDeepthi.StudentDetails;

import java.util.*;

public class StudentGrade {
	private static final Integer NO_OF_SUBJECTS = 6;

	public void studentAndTheirGrades() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total no.of student: ");
		Integer totalStudents = scanner.nextInt();
		List<StudentDetails> students = new ArrayList<>();
		for (int i = 1; i < totalStudents ; i++) {

			System.out.println("Enter Student" + i + " Details: ");
			System.out.println("Enter student name: ");
			String name = scanner.next();
			System.out.println("Enter student id: ");
			Integer id = scanner.nextInt();
			System.out.println("Enter student address: ");
			String address = scanner.next();
			System.out.println("Enter student total marks");
			Integer totalMarks = scanner.nextInt();

			StudentDetails student = new StudentDetails();
			student.setStudentNo(id);
			student.setStudentName(name);
			student.setStudentAddress(address);
			student.setStudentMark(totalMarks);
			students.add(student);
		}

		Map<StudentDetails, String> studentGradeMap = new HashMap<>();
		System.out.println("Before sorting my Student details are : ");
		for (StudentDetails student: students) {
			System.out.println("Student number: " + student.getStudentNo());
			studentGradeMap.put(student, calculateGrade((float) (student.getStudentMark() / NO_OF_SUBJECTS)));
		}

		List<Map.Entry<StudentDetails, String>> studentAndGrades = new ArrayList<>(studentGradeMap.entrySet());
		sortStudentsByGradeAndDisplay(studentAndGrades);
	}

	public String calculateGrade(Float percentage) {
		String grade;
		if (percentage >= 90) {
			grade = "Grade1";
		} else if (percentage > 60 && percentage < 90) {
			grade = "Grade2";
		} else if (percentage >= 35 && percentage <60) {
			grade = "Grade3";
		} else {
			grade = "Grade4";
		}
		return grade;
	}

	private void sortStudentsByGradeAndDisplay(List<Map.Entry<StudentDetails, String>> studentAndGrades) {
		Collections.sort(studentAndGrades, new Comparator<Map.Entry<StudentDetails, String>>() {
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
		for (Map.Entry<StudentDetails, String> entry : studentAndGrades) {
			System.out.println("student number" + entry.getKey().getStudentNo() + " : " + entry.getValue());

		}
	}

}