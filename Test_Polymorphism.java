package com.ptg.polymorphism;

class Employee {
	int employeeId;
	String employeeName;
	double salary;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public void Info1() {
		System.out.println(employeeId + employeeName + salary);
	}

	public void Info1(long mobileNumber) {
		System.out.println(mobileNumber);
	}
}

class Managers extends Employee {
	int employeeId;
	String employeeName;
	double salary;

	public Managers() {

	}

	public Managers(int employeeId, String employeeName, double salary) {

		super(1, "Sai", 23344.44);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		super.Info1();
	}

	public void Info1(long mobileNumber) {

	}

	public void Info2() {

		System.out.println(employeeName + employeeId + salary);
	}
}

public class Test_Polymorphism {
	public static void main(String[] args) {
		Employee e = new Managers(1, "pradeep", 20000);
		Managers managers=new Managers();
		e.Info1();
		managers.Info2();
		

	}
}
