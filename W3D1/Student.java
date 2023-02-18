package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name - Shree Varshini D");
	}
	
	public void studentDept() {
		System.out.println("Student department - MSc SS");
	}
	
	public void studentId() {
		System.out.println("Student ID - 16MSS043");
	}

	public static void main(String[] args) {
		Student s= new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		
		s.deptName();
		
		s.studentName();
		s.studentDept();
		s.studentId();
		

	}

}
