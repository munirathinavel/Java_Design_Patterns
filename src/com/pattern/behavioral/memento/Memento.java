package com.pattern.behavioral.memento;

public class Memento {
	private String fileName;
	private StringBuilder content;

	public Memento(String file, StringBuilder content) {
		this.fileName = file;
		// Notice the deep copy so that Memento and FileWritingUtil
		// content variables don't refer to same object
		this.content = new StringBuilder(content);
	}

	public String getFileName() {
		return fileName;
	}

	public StringBuilder getContent() {
		return content;
	}

}
