package com.pattern.behavioral.chainofresponsibility;

public enum LogLevel {
	INFO(1, "Info"), DEBUG(2, "Debug"), ERROR(3, "Error"), TRACE(4, "Trace");

	private int code;
	private String name;

	private LogLevel(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}