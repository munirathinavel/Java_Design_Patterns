package com.pattern.behavioral.chainofresponsibility;

public class ErrorLogHandler extends AbstractLogHandler {

	@Override
	protected boolean accept(LogRequest logRequest) {
		return (LogLevel.ERROR.equals(logRequest.getLevel())) ? true : false;
	}

	@Override
	protected void logMessage(LogRequest logRequest) {
		System.out.println(LogLevel.ERROR + ":: " + logRequest.getMessage());
	}

}
