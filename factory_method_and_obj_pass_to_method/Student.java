package com.vithu.factory_method_and_obj_pass_to_method;

public class Student 
{
	private String name;
	private int marks;
	
	// parameterized Constructor
	public Student(String name, int marks) 
	{
		
		this.name = name;
		this.marks = marks;
	}

	//getter and setter for the name
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	//getter and setter for the marks
	public int getMarks() 
	{
		return marks;
	}

	public void setMarks(int marks) 
	{
		this.marks = marks;
	}

	//override toString to return only the student name.
	@Override
	public String toString() {
		return name;
	}
	
	
	

}
