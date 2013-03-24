package com.headfirst.ch1;

public class Person {

	private static int alarmRingingCount = 0;
	private AlarmClock alarmClock = new AlarmClock();
	private CoffeeMachine coffeeMachine = new CoffeeMachine();
	private Toaster toaster = new Toaster();
	private Dog dog = new Dog();

	public void process()
			throws InterruptedException {
		while (alarmRingingCount < 3) {
			alarmClock.ringAlarm();
			Thread.sleep(5000);
			if (alarmRingingCount == 0) {
				alarmClock.snooze();
				coffeeMachine.waitForIt();
				toaster.waitForIt();
				dog.noWalkToday();
				alarmRingingCount++;
			} else if (alarmRingingCount == 1) {
				alarmClock.snooze();
				coffeeMachine.waitForIt();
				toaster.waitForIt();
				dog.getNewsPaper();
				alarmRingingCount++;
			} else {
				coffeeMachine.makeCoffee();
				toaster.toast();
				dog.wakeTheFucker();
				alarmRingingCount++;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Person tinker = new Person();
		tinker.process();
	}

}
