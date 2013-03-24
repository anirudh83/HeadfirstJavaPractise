package com.headfirst.ch1;

public class AlarmClock {

	public void snooze() throws InterruptedException {
		System.out.println("**********SNOOZING ALARM***************");
		Thread.sleep(1000);
	}

	public void ringAlarm() throws InterruptedException {
			System.out.println("******************ALARM IS RINGING********************");
			Thread.sleep(1000);
	}
}
