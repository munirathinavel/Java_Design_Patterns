package com.pattern.creational.builder;

public class Report {
	private String name;
	private int year;

	private String header;
	private String content;
	private String footer;

	public Report(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public void print() {
		System.out.println(this.header+"\n");
		System.out.println(this.content+"\n");
		System.out.println(this.footer+"\n");
	}

}
