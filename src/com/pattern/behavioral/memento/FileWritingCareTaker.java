package com.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Care taker
public class FileWritingCareTaker {
	private final List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}

}
