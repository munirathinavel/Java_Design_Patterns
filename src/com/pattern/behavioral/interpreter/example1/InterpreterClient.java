package com.pattern.behavioral.interpreter.example1;

public class InterpreterClient {
	public InterpreterContext ic;

	public InterpreterClient(InterpreterContext ic) {
		this.ic = ic;
	}

	public String interpret(String str) {
		IExpression exp = null;
		// create rules for expressions
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else
			return str;

		return exp.interpret(ic);
	}

}