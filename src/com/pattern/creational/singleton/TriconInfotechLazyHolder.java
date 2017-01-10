package com.pattern.creational.singleton;

public class TriconInfotechLazyHolder extends Organization {
	private TriconInfotechLazyHolder() {
		System.out.println("Inside TriconInfotechLazyHolder() constructor");
	}

	private static class SingletonHolder {
		private static final TriconInfotechLazyHolder INSTANCE = new TriconInfotechLazyHolder();
	}

	public static TriconInfotechLazyHolder getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
