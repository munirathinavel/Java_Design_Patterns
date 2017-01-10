package com.pattern.behavioral.state;

public class TVStopState implements IState {

	@Override
	public void doAction(TVContext context) {
		context.setState(this);
		System.out.println("TV is turned "+ context.getState().toString());
	}

	public String toString() {
		return "OFF";
	}
}