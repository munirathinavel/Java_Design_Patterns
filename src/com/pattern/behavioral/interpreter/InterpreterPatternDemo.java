package com.pattern.behavioral.interpreter;

public class InterpreterPatternDemo {

	public static void main(String args[]) {
		String input = "4 3 2 - 1 + *";
		// Postpix interpretation logic: 4*((3-2)+1)

		int output = new InterpreterClient().interpret(input);
		System.out.println("input: " + input + "\nresult: " + output);
	}

}