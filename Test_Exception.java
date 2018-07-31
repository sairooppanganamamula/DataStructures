package com.ptg.eceptionhandling;

import java.util.Scanner;

class PtgException extends Exception{
	public ptgException() {
		System.out.println("Denominator is non zero");
	}
}

class Test{
	
	public void info() throws PtgException {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter numerator");
		int numerator=s.nextInt();
		
		System.out.println("Enter denominator");
		int denominator=s.nextInt();
		
		if(denominator == 0) {
			throw new PtgException();
		}
		try {
			int result=numerator/denominator;
			System.out.println("Result is:" +result);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			s.close();
		}
		
		System.out.println("----------------");
		System.out.println("copyrights@2018");
		System.out.println("----------------");
		
	}


  public void info2() {
	  try {
		  int numerator=500;
		  int denominator=0;
	  
		  try {
			  String s=new String("Java");
			  char c=s.charAt(5);
			  System.out.println(c);
		  }
	  catch(Exception e3) {
		  System.out.println(e3)
	  }
  }
public class Test_Exception {
public static void main(String[] args) throws PtgException {
	Test t=new Test();
	t.info();
}
}
}
