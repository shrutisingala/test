package com.pojo;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int[] marks;
	private int rollNo;
	
	public Student() {
		int noofmarks = 5;
		name="abc";
		marks = new int[noofmarks];
		rollNo = 0;
	}

	public Student(String name, int[] marks, int rollNo) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void display() {
		System.out.println("Name:"+name+"\nMarks:");
		for (int num:marks) {
			System.out.print(num+" ");
		}
		System.out.println("Roll number:"+rollNo+"\n");
	}
	

}
