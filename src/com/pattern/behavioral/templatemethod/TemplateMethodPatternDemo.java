package com.pattern.behavioral.templatemethod;

public class TemplateMethodPatternDemo {

	public static void main(String[] args) {
		System.out.println("Generating and printing reports using template ..\n");
		
		ReportTemplate reportTemplate = new EmployeeTechnicalPerformanceReport(2015);
		reportTemplate.generateAndPrintReport();

		System.out.println("");
		reportTemplate = new EmployeeCulturalPerformanceReport(2015);
		reportTemplate.generateAndPrintReport();
	}

}
