package com.vithu.factory_method_and_obj_pass_to_method;
import java.util.Scanner;


public class StudentGradeCalculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//input from user
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		
		//student object
		
		Student student = new Student(name, marks);
		
		//calculate grade
		StudentGrade studentGrade = CalculateStudentGrade.calculateGrade(student);

        // Output the result
        System.out.println(studentGrade);
        
        sc.close();
	}
}
