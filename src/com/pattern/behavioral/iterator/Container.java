package com.pattern.behavioral.iterator;

public interface Container {
	void addName(String name);
	void removeName(String name);
	
	Iterator getIterator();
}
