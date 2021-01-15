package com.ga;

public class Student {
	 	int rollno;
		String name;
	public Student() {
		// TODO Auto-generated constructor stub
		}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
		//.jsp requires getters/setters
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	//whenever you print an object the toString method is automatically called
	
	
	
}
