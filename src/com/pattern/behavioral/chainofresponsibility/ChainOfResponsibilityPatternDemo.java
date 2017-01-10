package com.pattern.behavioral.chainofresponsibility;

public class ChainOfResponsibilityPatternDemo {

	public static void main(String[] args) {
		// Prepare log handlers chain
		ILogHandler logHandler = getLogHandlersChain();

		logHandler.handleRequest(null);
		logHandler.handleRequest(new LogRequest(LogLevel.TRACE, "This is a trace message."));
		logHandler.handleRequest(new LogRequest(LogLevel.INFO, "This is an info message."));
		logHandler.handleRequest(new LogRequest(LogLevel.DEBUG, "This is a debug message."));
		logHandler.handleRequest(new LogRequest(LogLevel.ERROR, "This is an error message."));
	}

	private static ILogHandler getLogHandlersChain() {
		final ILogHandler logHandler = new ErrorLogHandler();
		ILogHandler logHandler2 = new DebugLogHandler();
		ILogHandler logHandler3 = new InfoLogHandler();

		logHandler.setSuccessor(logHandler2);
		logHandler2.setSuccessor(logHandler3);

		return logHandler;
	}

}
