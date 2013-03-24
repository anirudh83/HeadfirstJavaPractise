package com.headfirst.ch1;

public class Toaster {
	
	public void toast() throws InterruptedException{
		System.out.println("Preparing toast.......");
		Thread.sleep(2000);
		System.out.println("Toast is ready......................");
	}

	public void waitForIt(){
		System.out.println("**** Not preparing Toast****");
	}
}
