package com.pattern.creational.builder;

public class ReportFooterBuilder extends ReportBuilder {
	@Override
	public Object build() {
		return "Confidential document of Tricon Infotech Pvt. Ltd.";
	}
}
