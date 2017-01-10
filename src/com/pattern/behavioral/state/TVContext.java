package com.pattern.behavioral.state;

public class TVContext {
	private IState tvState;

	public void setState(IState state) {
		this.tvState = state;
	}

	public IState getState() {
		return this.tvState;
	}

}
