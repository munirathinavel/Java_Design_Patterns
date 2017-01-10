package com.pattern.creational.singleton;

public class TriconInfotechLazySynchronized extends Organization {
	private static TriconInfotechLazySynchronized instance = null;

	private TriconInfotechLazySynchronized() {
		System.out.println("Inside TriconInfotechLazySynchronized() constructor");
	}

	public static synchronized TriconInfotechLazySynchronized getInstance() {
		return (instance == null) ? instance = new TriconInfotechLazySynchronized() : instance;
	}

}
