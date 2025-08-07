package com.vithu.factory_method_and_obj_pass_to_method;

public class CalculateStudentGrade 
{
	//factory method to calculate grade
	
	public static StudentGrade calculateGrade(Student student)
	{
		int marks = student.getMarks();
		char grade;
		
		if (marks > 90)
		{
			grade = 'A';	
		}
		else if (marks>= 75)
		{
			grade = 'B';
			
		}
		else if (marks >= 60)
		{
			grade = 'c';
		}
		else
		{
			grade = 'D';
		}
		
		return new StudentGrade(student, grade);
	}

}
