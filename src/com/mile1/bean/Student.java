package com.mile1.bean;

public class Student {
	String name;
	int marks[];
	String grade;
	public Student()
	{
		
	}
	public Student(String name,int marks[]) {
		this.name=name;
		this.marks=marks;
	}
	public Student(String name, int[] marks, String grade) {
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return this.marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}	
}
