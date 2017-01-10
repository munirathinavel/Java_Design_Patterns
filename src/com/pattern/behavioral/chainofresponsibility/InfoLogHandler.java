package com.pattern.behavioral.chainofresponsibility;

public class InfoLogHandler extends AbstractLogHandler {

	@Override
	protected boolean accept(LogRequest logRequest) {
		return (LogLevel.INFO.equals(logRequest.getLevel())) ? true : false;
	}

	@Override
	protected void logMessage(LogRequest logRequest) {
		System.out.println(LogLevel.INFO + ":: " + logRequest.getMessage());
	}

}
