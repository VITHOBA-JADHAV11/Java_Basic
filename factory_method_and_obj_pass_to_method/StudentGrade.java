package com.vithu.factory_method_and_obj_pass_to_method;

public class StudentGrade 
{
	private Student student;
	private char studentGrade;
	
	// Parameterized Constructor
	public StudentGrade(Student student, char studentGrade)
	{
		this.student = student;
		this.studentGrade = studentGrade;
	}

	
	// setter and getter for student
	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}

	//getter and setter for studentGrade
	public char getStudentGrade() 
	{
		return studentGrade;
	}

	public void setStudentGrade(char studentGrade) 
	{
		this.studentGrade = studentGrade;
	}

	//to print toString 

	@Override
	public String toString() {
		return "--  The Student " + student.toString() + " has '" + studentGrade + "' Grade  --";
	}
	

	
	

}
