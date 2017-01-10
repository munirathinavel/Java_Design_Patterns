package com.pattern.behavioral.state;

public class TVRemote {
	private TVContext context = null;

	public TVRemote() {
		this.context = new TVContext();
	}

	public void switchOn() {
		System.out.println("Starting TV now ..");
		IState tvStartState = new TVStartState();
		tvStartState.doAction(context);
	}

	public void switchOff() {
		System.out.println("Stopping TV now ..");
		IState tvStopState = new TVStopState();
		tvStopState.doAction(context);
	}

}
