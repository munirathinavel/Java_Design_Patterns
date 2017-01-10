package com.pattern.behavioral.observer;

public interface Subject {
	void registerObserver(Observer observer);

	void unRegisterObserver(Observer observer);
	
	void notifyObservers();

	Object getUpdate();
}
