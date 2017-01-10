package com.pattern.behavioral.templatemethod;

import java.util.Date;

public class EmployeeTechnicalPerformanceReport extends ReportTemplate {

	protected EmployeeTechnicalPerformanceReport(int year) {
		super(ReportType.EMPLOYEE_TECHNICAL_PERFORMANCE_REVIEW.getName(), year);
	}

	@Override
	public String printHeader() {
		return getReportName() + " Report      (Date: " + new Date().toString() + ")";
	}

	@Override
	public String printContent() {
		return new StringBuilder("Employee Name").append(TAB).append("Technical Performance(1-10)\n")
				.append("=============").append("========").append("================================\n")
				.append("John").append(TAB2).append("6").append("\n")
				.append("Shyam").append(TAB2).append("8").append("\n")
				.append("Khan").append(TAB2).append("4").append("\n")
				.append("=============").append("========").append("================================")
				.toString();
	}

	@Override
	public String printFooter() {
		return "Confidential document of Tricon Infotech Pvt. Ltd.";
	}

}
