package com.pattern.creational.builder;

import java.util.Date;

public class ReportHeaderBuilder extends ReportBuilder {

	private String reportName;

	public ReportHeaderBuilder(String reportName) {
		this.reportName = reportName;
	}

	@Override
	public Object build() {
		return reportName + " Report      (Date: " + new Date().toString() + ")";
	}

}
