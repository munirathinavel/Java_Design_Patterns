package com.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

	private List<Observer> observersList;
	private boolean stateChanged;

	public Blog() {
		this.observersList = new ArrayList<Observer>();
		this.stateChanged = false;
	}

	public void registerObserver(Observer observer) {
		observersList.add(observer);
	}

	public void unRegisterObserver(Observer observer) {
		observersList.remove(observer);
	}

	public void notifyObservers() {
		if (stateChanged) {
			for (Observer observer : observersList) {
				observer.update(this);
			}
		}
	}

	public Object getUpdate() {
		Object changedState = null;
		// should have logic to send the state change to querying observer
		if (stateChanged) {
			changedState = "New Article " + System.currentTimeMillis();
		}
		return changedState;
	}

	public void postNewArticle() {
		stateChanged = true;
		notifyObservers();
	}

}