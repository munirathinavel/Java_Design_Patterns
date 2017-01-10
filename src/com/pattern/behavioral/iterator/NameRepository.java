package com.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements Container {
	private List<String> names;

	public NameRepository() {
		names = new ArrayList<String>();
	}

	@Override
	public void addName(String name) {
		names.add(name);
	}

	@Override
	public void removeName(String name) {
		names.remove(name);
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			return (index < names.size()) ? true : false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
	}

}