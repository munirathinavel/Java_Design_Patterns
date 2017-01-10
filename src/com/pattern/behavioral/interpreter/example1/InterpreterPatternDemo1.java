package com.pattern.behavioral.interpreter.example1;

public class InterpreterPatternDemo1 {

	public static void main(String args[]) {
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";

		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1 + " = " + ec.interpret(str1));
		System.out.println(str2 + " = " + ec.interpret(str2));
	}

}
