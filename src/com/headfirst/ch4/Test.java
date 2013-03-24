package com.headfirst.ch4;

/**
 * 
 * @author Anirudh
 *java passes by value
 *hence primitives wont be changed
 *but objects will get changed as they are references (like pointers)
 */
public class Test {
	
	public void process(int x, int y){
		x=0;
		y=0;
	}

	public void processPerson(Person p){
		p.name="Chacha";
		p.age=12;
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.name="Raka";
		p.age=11;
		System.out.println("name : "+p.name +" age : "+p.age);
		Test test = new Test();
		test.processPerson(p);
		System.out.println("name : "+p.name +" age : "+p.age);
		
		int x=10;
		int y =11;
		test.process(x, y);
		System.out.println(x +" " +y);
		
	}
}
