package com.headfirst.ch1;

public class CoffeeMachine {
	
	public void makeCoffee() throws InterruptedException{
		System.out.println("Coffee is getting processed.....");
		Thread.sleep(2000);
		System.out.println("*************Coffee is ready..............");
	}

	public void waitForIt(){
		System.out.println("Coffee is not getting prepared.....");
	}
}
