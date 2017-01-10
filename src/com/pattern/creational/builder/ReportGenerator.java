package com.pattern.creational.builder;

import java.util.Date;

public class ReportGenerator {

	public enum ReportType {
		EMPLOYEE_PERFORMANCE_REVIEW(1, "Employee Performance Review");

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

	public static void generateReport(ReportType reportType) {
		final Report report = new Report(reportType.getName(), new Date().getYear());
		report.setHeader((String) new ReportHeaderBuilder(reportType.getName()).build());
		report.setContent((String) new ReportContentBuilder().build());
		report.setFooter((String) new ReportFooterBuilder().build());

		report.print();
	}
}
