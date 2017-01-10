package com.pattern.behavioral.interpreter.example1;

public class IntToBinaryExpression implements IExpression {

	private int i;

	public IntToBinaryExpression(int c) {
		this.i = c;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(this.i);
	}

}