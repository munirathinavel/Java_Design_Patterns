package com.pattern.behavioral.interpreter.example1;

public class IntToHexExpression implements IExpression {

	private int i;

	public IntToHexExpression(int c) {
		this.i = c;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexadecimalFormat(i);
	}

}