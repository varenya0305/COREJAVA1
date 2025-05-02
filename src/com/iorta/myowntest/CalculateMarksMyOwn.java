package com.iorta.myowntest;

public class CalculateMarksMyOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentStr = "Varenya:English-95,Maths-70,Science-55,History-62,Geography-60,PT-75_Dhrriti:English-90,Maths-85,Science-78,History-62,Geography-56,PT-43_Diya:English-45,Maths-20,Science-45,History-52,Geography-12,PT-55_Krishna:English-79,Maths-91,Science-65,History-73,Geography-88,PT-83";

		CalculateMarks(studentStr);
	}

	public static String CalculateMarks(String student) {
		int highestMarks = 0; //To calculate highest total marks
		String highestScorer = ""; //To check who scored the highest marks

		String[] students = student.split("_"); //Splits each student with their respective details into a different line, based on "_"
		for (int i=0; i < students.length; i++) {

			StringBuilder studentTotal = new StringBuilder(); //Stores total marks of all studentd
			
			StringBuilder failedSubjects = new StringBuilder(); //Stores failed subjects 
			
			//System.out.println(students[i]); //Prints each student name and their details on a different line

			String[] names = students[i].split(":"); //Splits each student name from their subjects, based on ":"
			//System.out.println(Arrays.toString(names)); //name - index 0, subjects + marks - index 1
			//System.out.println(names[1]); //Prints name or subjects + marks based on the provided index number (names[0] or names[1])

			String[] subjects = names[1].split(","); //Splits the marks on index 1 in the "names" array, based on ","
			//System.out.println(Arrays.toString(subjects)); //Prints the array elements after the split (6 elements)

			int total = 0;

			for(int j=0; j < subjects.length; j++) { //Iterates through the elements in subjects array
				String marks[] = subjects[j].split("-"); //Splits the subjects from marks into different individual lines (marks[0] - subject, marks[1] - marks)
				//System.out.println(names[0] + ": " + marks[1]); //Prints student name from names array (index 0) with their marks from marks array (index 1)
				
				//Passes marks as a parameter to checkPassFail method for it to do its logic. 
				//Assigns the method return value to a String variable called subject
				String subject = checkPassFail(marks);
				
				//Logic - if checkPassFail method return value (assigned to subject variable) is NOT empty, then add the return value + "," to a StringBuilder called subjectBuilder
				if (subject != "") {
					failedSubjects.append(subject + ",");
				} 
				
				//Logic to add marks to get total
				total += Integer.parseInt(marks[1]);
				//System.out.println("Total marks: " + total);
			}

			//Logic to calculate highest marks
			//highestMarks is set to 0, if the total is higher than highestMarks, assign total to highestMarks and assign the student name to the variable "highestScorer".
			if(highestMarks < total) {
				highestMarks = total;
				highestScorer = names[0];
			}
		
			studentTotal.append(total); //Appends the total marks of students to studentTotal stringBuilder
			
			//Logic to handle not fail subjects
			String grade = "F";
			//If the subjectBuilder's length is 0, meaning if it doesn't have anything in it, then the getGrade's return value is assigned to grade variable.
			if (failedSubjects.length() == 0) {
				grade = getGrade(total); //Passes the total as a parameter to getGrade method and stores the return value in the variable called grade.
				failedSubjects.append("None"); //Since subjectBuilder is empty, meaning the student has not failed anything, so we append the word called "None" to show that.
			} else { //If the subjectBuilder has values, then the commas at the end of the StringBuilder are removed.
				failedSubjects.deleteCharAt(failedSubjects.lastIndexOf(","));
				//deleteCharAt is a method that removed a character at a specified index. 
				//Here, the lastIndexOf method is used to get the index of the last occurence of "," in subjectBuilder and this index is fed into deleteCharAt to remove it.
			}
			
			//Display everything
			//Student Name, Total Marks, Subjects, Grade, and Failed Subjects)
			System.out.println("Student Name: " + names[0] 
					+ "\nTotal Marks: " + studentTotal 
					+ "\nSubjects: " + names[1] 
					+ "\nGrade: " + grade 
					+ "\nFailed Subjects: " + failedSubjects 
					+ "\n");
		}	
		
		//Displays the highest scorer name and the corresponding marks.
		System.out.println("Highest Scorer: " + highestScorer + " with " + highestMarks + " marks.");
		return null;
	}
 
	public static String getGrade(int total) {
		
		String grade = ""; //Empty string assigned to variable grade that will be replaced by the logic
		
		//Conditional statement to categorise the Sstotal marks into grades.
		if(total > 500) {
			grade = "A";
		} else if (total < 500 && total > 400) {
			grade = "B";
		} else if(total < 400 && total > 300) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade; //returns the final assigned grade value to CalculateMarks method
	}

	public static String checkPassFail(String[] marks) {
		//Receives marks array as a parameter from CalculateMarks method
		
		String subject = ""; //Empty string assigned to subject that will be replaced by the logic
		
		//Convert data type of the marks in index 1 of marks array into integer
		//If marks < 50, the marks are assigned to subject variable
		if (Integer.parseInt(marks[1]) < 50) {
			subject = marks[0];
		}	
		return subject;	//Returns the final assigned subject value to CalculateMarks method
	}

}
