package com.pattern.behavioral.memento;

// Originator
public class FileWritingUtil {
	private String fileName;
	private StringBuilder content;

	public FileWritingUtil(String file) {
		System.out.println("Started writing content to file: " + file);
		this.fileName = file;
		this.content = new StringBuilder();
	}

	public String getFileName() {
		return fileName;
	}

	public String getFileContent() {
		return this.content.toString();
	}

	public void write(String str) {
		content.append(str);
	}

	public Memento saveToMemento() {
		return new Memento(this.fileName, this.content);
	}

	public void restoreFromMemento(Memento memento) {
		this.fileName = memento.getFileName();
		this.content = memento.getContent();
	}

}
