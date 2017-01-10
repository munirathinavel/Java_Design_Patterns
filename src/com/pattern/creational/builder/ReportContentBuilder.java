package com.pattern.creational.builder;

public class ReportContentBuilder extends ReportBuilder {
	private static final String TAB = "\t";
	private static final String TAB2 = "\t\t";

	@Override
	public Object build() {
		return new StringBuilder("Employee Name").append(TAB).append("Performance(scale between 1-10)\n")
				.append("=============").append("========").append("================================\n")
				.append("John").append(TAB2).append("6").append("\n")
				.append("Shyam").append(TAB2).append("8").append("\n")
				.append("Khan").append(TAB2).append("4").append("\n")
				.append("=============").append("========").append("================================")
				.toString();
	}
}
