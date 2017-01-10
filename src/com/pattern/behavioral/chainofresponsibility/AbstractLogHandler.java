package com.pattern.behavioral.chainofresponsibility;

public abstract class AbstractLogHandler implements ILogHandler {
	private ILogHandler successor;

	@Override
	public void setSuccessor(ILogHandler successor) {
		this.successor = successor;
	}

	@Override
	public void handleRequest(LogRequest logRequest) {
		if (logRequest == null) {
			System.out.println("Null log request can't be handled. Ignoring..");
			return;
		}
		if (accept(logRequest)) {
			logMessage(logRequest);

		} else if (this.successor != null) {
			this.successor.handleRequest(logRequest);

		} else {
			logMessageDefault(logRequest);
		}
	}

	protected abstract boolean accept(LogRequest logRequest);

	protected abstract void logMessage(LogRequest logRequest);

	private void logMessageDefault(LogRequest logRequest) {
		System.out.println(logRequest.getLevel() + " log request can't be handled as not yet implemented.");
	}

}
