package com.pattern.behavioral.interpreter;

public class MultiplyExpression implements IExpression {

	private IExpression leftExpression;
	private IExpression rightExpresion;

	public MultiplyExpression(IExpression leftExpression, IExpression rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}

	@Override
	public int interpret() {

		return leftExpression.interpret() * rightExpresion.interpret();
	}

}