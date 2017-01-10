package com.pattern.behavioral.chainofresponsibility;

public interface ILogHandler {	
	void handleRequest(LogRequest logRequest);

	void setSuccessor(ILogHandler logHandler);	
}
