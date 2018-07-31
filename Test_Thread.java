package com.ptg.thread;



class Test extends Thread{
	 int employeeId;
	 String employeeName;
	 double salary;
	 
	 public void run() {
		 System.out.println(Thread.currentThread().getId()+"\t"+ "\t"+ Thread.currentThread().getName()+"\t"  + Thread.currentThread().getsalary()"\t"+ salary);
	 }
 }
public class Test_Thread {
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.employeeId(21);
		e1.employeeName("SRC");
		e1.Salary(334.33);
		
		e2.employeeId(33);
		e2.employeeName("JJK");
		e2.Salary(33445.33);
		
		e3.employeeId(22);
		e3.employeeName("GGJ");
		e3.Salary(44455.33);
		
		e1.start();
		e2.start();
		e3.start();
		
	
		
	}

}
