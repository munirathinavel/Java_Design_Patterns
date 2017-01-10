package com.pattern.behavioral.templatemethod;

public enum ReportType {
	EMPLOYEE_TECHNICAL_PERFORMANCE_REVIEW(1, "Employee Technical Performance Review"),
	EMPLOYEE_CULTURAL_PERFORMANCE_REVIEW(2, "Employee Cultural Performance Review");

	private int code;
	private String name;

	private ReportType(int code, String name) {
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