package com.pattern.behavioral.interpreter;

import java.util.Stack;

public class InterpreterClient {
	// Client holds stack as Context object to maintain the state information
	private final Stack<IExpression> stack = new Stack<IExpression>();

	public int interpret(String input) {
		String[] tokenList = input.split(" ");
		for (String token : tokenList) {
			if (isOperator(token)) {
				IExpression rightExpression = stack.pop();
				IExpression leftExpression = stack.pop();
				IExpression operatorExpression = getOperatorExpression(token,
						leftExpression, rightExpression);
				int output = (operatorExpression != null) ? operatorExpression.interpret() : 0;
				stack.push(new NumberExpression(output));
			} else {
				IExpression numberExpression = new NumberExpression(token);
				stack.push(numberExpression);
			}
		}
		return stack.pop().interpret();
	}

	private boolean isOperator(String str) {
		if ("+".equals(str) || "-".equals(str) || "*".equals(str)) {
			return true;
		} else {
			return false;
		}
	}

	private IExpression getOperatorExpression(String operatorStr, IExpression left,
			IExpression right) {
		if ("+".equals(operatorStr)) {
			return new PlusExpression(left, right);

		} else if ("-".equals(operatorStr)) {
			return new MinusExpression(left, right);

		} else if ("*".equals(operatorStr)) {
			return new MultiplyExpression(left, right);
		}
		return null;
	}

}
