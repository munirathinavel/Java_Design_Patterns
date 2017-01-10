package com.pattern.behavioral.interpreter;

public class InterpreterContext {
	private String input;
	private int output;

	public InterpreterContext(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public int getOutput() {
		return output;
	}

}
