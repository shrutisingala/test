package com.pojo;

public class Employee extends Person{
	private double empSalary;
	private int empId;
	
	public Employee() {
		super();
		empId = 0;
		empSalary = 1000;
	}
	
	public Employee(int empId, double empSalary, int age, String name) {
		super(age, name);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void display(int x) {
		System.out.println("Employee ID: " + empId + "\nEmployee Salary: " + empSalary);
		super.display();
		}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId+" "+empSalary+" "+super.toString();
	}
	
	
	

}
