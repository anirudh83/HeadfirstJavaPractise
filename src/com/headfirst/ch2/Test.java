package com.headfirst.ch2;

public class Test {

	String str;
	
	public class A extends Test{
		void foo(){
			String s ="yyoy";
			s.concat("yo");
			s.toUpperCase().toLowerCase();
			System.out.println("Class A");
		}
	}
	
	public class B{
		void foo(){
			System.out.println("Class A");
		}
	}

	
}
