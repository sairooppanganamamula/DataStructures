package com.ptg.strings;
 import java.lang.String;
 import java.lang.StringBuffer;
 import java.lang.StringBuilder;
import java.util.stream.IntStream;
 class Employee{
	 String username;
	 String password;
	 StringBuffer emailId;
	 StringBuilder address;
	 
	 public Employee() {
		 username="James";
		 password=new String("JAMES");
		 emailId=new StringBuffer("jam@gmail.com");
		 address=new StringBuilder("USA");
		 
	 }
	 
	 public void employeeInfo1() {
		 char characterAt=username.charAt(2);
		 System.out.println("Char at specified index is  " +characterAt);
	 }
	 
	 public void employeeInfo2() {
	char codePointAt = (char) username.codePointAt(3);
	 System.out.println("CodePoint at specified index is  " +codePointAt);

	 }
	 
	 public void employeeInfo3() {
		boolean equals= username.equals(password);
		 System.out.println("comparison is  " +equals);

		 
	 }
	 public void employeeInfo4() {
			int length = username.length();
			System.out.println("Length is  " +length);
			 

			 
		 }
      
	 public void employeeInfo5() {
			boolean issame= username.equalsIgnoreCase(password);
			 System.out.println("Is same " +issame);

			 
		 }

	 public void employeeInfo6() {
		String concat	= username.concat(password);
			 System.out.println("Concatenated String is "  +concat);

			 
		 }
	 
	 public void employeeInfo7() {
		String sub	= username.substring(0, 2);
			 System.out.println("Substring is " +sub);

			 
		 }
	 
	 public void employeeInfo8() {
		IntStream seq	= username.chars();
			 System.out.println("Chars is  " +seq);

			 
		 }
	 
	 public void employeeInfo9() {
		char cp	= (char) username.codePointBefore(2);
			 System.out.println("Code Point Befor " +cp);

			 
		 }
	 
	 public void employeeInfo10() {
	int codePointCount	= username.codePointCount(0, 3);
			 System.out.println("Count is " +codePointCount);

			 
		 }
	 
	 public void employeeInfo11() {
		IntStream codePoints	= username.codePoints();
			 System.out.println("CodePoints are " +codePoints);

			 
		 }
	 
	 public void employeeInfo12() {
		int compareStrings	= username.compareTo(password);
			 System.out.println("Comparison value " +compareStrings);

			 
		 }
	 
	 public void employeeInfo13() {
		int ctic	= username.compareToIgnoreCase(username);
			 System.out.println("Comparison value " +ctic);

			 
		 }
	 
	 public void employeeInfo14() {
	boolean conts	= username.contains("s");
			 System.out.println("Contains s? " +conts);

			 
		 }
	 
	 public void employeeInfo15() {
		boolean ce	= username.contentEquals(emailId);
			 System.out.println("Content Equals " +ce);

			 
		 }
	 
	 public void employeeInfo16() {
		boolean cs	= username.contentEquals(emailId);
			 System.out.println("Content Equals " +cs);

			 
		 }
	 
	 public void employeeInfo17() {
		boolean ew	= username.endsWith(password);
			 System.out.println("Ends With " +ew);

			 
		 }
	 public void employeeInfo18() {
		byte[] gb	= username.getBytes();
			 System.out.println("Bytes " +gb);

			 
		 }
	 public void employeeInfo19() {
		 emailId.append(".com");
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo20() {
		 emailId.append("password");
		 System.out.println(emailId);
	 }
	 
	 
	 
	 public void employeeInfo22() {
		 emailId.setLength(3);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo23() {
		 emailId.length();
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo24() {
		 emailId.append(334.33);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo25() {
		 emailId.append(3.4);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo26() {
		 emailId.append(45);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo27() {
		 emailId.append(998977654l);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo28() {
		 emailId.appendCodePoint(3);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo29() {
		 emailId.capacity();
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo30() {
		 emailId.charAt(2);
		 System.err.println(emailId);
	 }
	 
	 public void employeeInfo31() {
		 emailId.codePointBefore(3);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo32() {
		 emailId.delete(1, 3);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo33() {
		 emailId.deleteCharAt(4);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo34() {
		 emailId.equals(password);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo35() {
		 emailId.indexOf(password);
		 System.out.println(emailId);
	 }
	 
	 public void employeeInfo36() {
		 emailId.lastIndexOf(username);
		 System.out.println(emailId);
	 }
	 
	public void employeeInfo37() {
		address.append(password);
		System.out.println(address);
	}
	
	public void employeeInfo38() {
		address.toString();
		System.out.println(address);
	}
	
	public void employeeInfo39() {
		address.setLength(6);
		System.out.println(address);
	}
	
	public void employeeInfo40() {
		address.length();
		System.out.println(address);
	}
	
	public void employeeInfo41() {
		address.append(4);
		System.out.println(address);
	}
	
	public void employeeInfo42() {
		address.append(true);
		System.out.println(address);
	}
	
	public void employeeInfo43() {
		address.append(3345.55);
		System.out.println(address);
	}
	
	public void employeeInfo44() {
		address.capacity();
		System.out.println(address);
	}
	
	public void employeeInfo45() {
		address.charAt(1);
		System.out.println(address);
	}
	
	public void employeeInfo46() {
		address.chars();
		System.out.println(address);
	}
	
	public void employeeInfo47() {
		address.codePoints();
		System.out.println(address);
	}
	
	public void employeeInfo48() {
		address.delete(0, 1);
		System.out.println(address);
	}
	
	public void employeeInfo49() {
		address.indexOf(username);
		System.out.println(address);
	}
	
	public void employeeInfo50() {
		address.hashCode();
		System.out.println(address);
	}
	
	public void employeeInfo51() {
		address.lastIndexOf(password);
		System.out.println(address);
	}
	
	public void employeeInfo52() {
		address.notify();
		System.out.println(address);
	}
 }
 
 
 
 public class Test_Strings{
	 public static void main(String[] args) {
		 Employee e=new Employee();
		 e.employeeInfo1();
		 e.employeeInfo2();
		 e.employeeInfo3();
		 e.employeeInfo4();
		 e.employeeInfo5();
		 e.employeeInfo6();
		 e.employeeInfo7();
		 e.employeeInfo8();
		 e.employeeInfo9();
		 e.employeeInfo10();
		 e.employeeInfo11();
		 e.employeeInfo12();
		 e.employeeInfo13();
		 e.employeeInfo14();
		 e.employeeInfo15();
		 e.employeeInfo16();
		 e.employeeInfo17();
		 e.employeeInfo18();
		 e.employeeInfo19();
		 e.employeeInfo20();
		 e.employeeInfo22();
		 e.employeeInfo23();
		 e.employeeInfo24();
		 e.employeeInfo25();
		 e.employeeInfo26();
		 e.employeeInfo27();
		 e.employeeInfo28();
		 e.employeeInfo29();
		 e.employeeInfo30();
		 e.employeeInfo31();
		 e.employeeInfo32();
		 e.employeeInfo33();
		 e.employeeInfo34();
		 e.employeeInfo35();
		 e.employeeInfo36();
		 e.employeeInfo37();
		 e.employeeInfo38();
		 e.employeeInfo39();
		 e.employeeInfo40();
		 e.employeeInfo41();
		 e.employeeInfo42();
		 e.employeeInfo43();
		 e.employeeInfo44();
		 e.employeeInfo45();
		 e.employeeInfo46();
		 e.employeeInfo47();
		 e.employeeInfo48();
		 e.employeeInfo49();
		 e.employeeInfo50();
		 e.employeeInfo51();
		 e.employeeInfo52();
		 
	 }
	 
	
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
     

