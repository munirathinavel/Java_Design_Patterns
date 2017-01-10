package com.pattern.behavioral.chainofresponsibility;

public class DebugLogHandler extends AbstractLogHandler {

	@Override
	protected boolean accept(LogRequest logRequest) {
		return (LogLevel.DEBUG.equals(logRequest.getLevel())) ? true : false;
	}

	@Override
	protected void logMessage(LogRequest logRequest) {
		System.out.println(LogLevel.DEBUG + ":: " + logRequest.getMessage());
	}

}
