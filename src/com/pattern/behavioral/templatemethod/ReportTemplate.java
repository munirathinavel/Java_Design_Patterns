package com.pattern.behavioral.templatemethod;

public abstract class ReportTemplate {
	protected static final String TAB = "\t";
	protected static final String TAB2 = "\t\t";

	private String reportName;
	private int year;

	protected ReportTemplate(String reportName, int year) {
		this.reportName = reportName;
		this.year = year;
	}

	public String getReportName() {
		return reportName;
	}

	public int getYear() {
		return year;
	}

	protected abstract String printHeader();

	protected abstract String printContent();

	protected abstract String printFooter();

	public Report generateReport() {
		final Report report = new Report(reportName, year);
		report.setHeader(printHeader());
		report.setContent(printContent());
		report.setFooter(printFooter());

		return report;
	}

	public void generateAndPrintReport() {
		generateReport().print();
	}

}
