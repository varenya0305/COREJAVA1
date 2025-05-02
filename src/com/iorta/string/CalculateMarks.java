package com.iorta.string;

import java.util.Arrays;

public class CalculateMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentStr = "Varenya:English-35,Maths-30,Science-35,History-62,Geography-60,PT-75_Dhrriti:English-90,Maths-85,Science-78,History-62,Geography-56,PT-43_Diya:English-45,Maths-20,Science-45,History-52,Geography-12,PT-55_Krishna:English-79,Maths-91,Science-65,History-73,Geography-88,PT-83";
		getStudentMarks(studentStr);
	}

	public static String getStudentMarks(String student) {
		int highestMarks = 0;
		@SuppressWarnings("unused")
		String highestScorer = "";
		String[] students = student.split("_");

		for(int i=0; i < students.length; i++) {
			StringBuilder studentTotal = new StringBuilder();
			StringBuilder subjectBuilder = new StringBuilder();
			//System.out.println(students[i]);
			String[] studentDetails = students[i].split(":");
			//System.out.println(studentDetails[1]);
			String[] subjects = studentDetails[1].split(",");
			//System.out.println(Arrays.toString(subjects));
			int total = 0;

			for(int j=0; j < subjects.length; j++) {
				String[] marks = subjects[j].split("-");
				System.out.println(studentDetails[0]+": "+Arrays.toString(marks));	
				String subject = passFail(marks);
				if (subject != "") {
					subjectBuilder.append(subject + ",");
				}
				total += Integer.parseInt(marks[1]);
				//System.out.println(studentDetails[0] + ": " + total);
			}
			if (highestMarks < total) {
				highestMarks = total;
				highestScorer = studentDetails[0];
			}
			String grade = "F";
			if (subjectBuilder.length() == 0) {
				subjectBuilder.append("None");
				grade = getGrade(total);
			} else {
				subjectBuilder.deleteCharAt(subjectBuilder.lastIndexOf(","));
			}
			//studentTotal.append(total);
			System.out.println("Name: " + studentDetails[0]  + "\nTotal Marks: " + studentTotal  + "\nGrade: " + grade  + "\nSubjects: "  + studentDetails[1] + "\nFailed Subjects: " + subjectBuilder.toString());
			//System.out.println("--------------------------------------------");
		}			
		//System.out.println(highestScorer + " has the highest total marks of " + highestMarks);
		return null;
	}

	
	public static String getGrade(int total) {
		String grade = "";
		if(total > 500) {
			grade = "A";	
		} else if (total > 400 && total < 500) {
			grade = "B";
		} else if (total > 300 && total < 400) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
	}


	public static String passFail(String[] subjectMark) {
		String subject = "";
		if(Integer.parseInt((subjectMark[1])) < 50) {
			subject = subjectMark[0];
		}
		return subject;
	}
}
