package com.pattern.creational.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		System.out.println("Building employee reports ..\n");
		ReportGenerator.generateReport(ReportGenerator.ReportType.EMPLOYEE_PERFORMANCE_REVIEW);
	}

}
