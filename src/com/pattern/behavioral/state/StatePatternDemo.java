package com.pattern.behavioral.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		TVRemote tvRemote = new TVRemote();
		tvRemote.switchOn();

		System.out.println("Watching good serial..");
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		tvRemote.switchOff();
	}

}
