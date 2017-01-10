package com.pattern.creational.singleton;

public class TriconInfotechEager extends Organization {
	private static final TriconInfotechEager INSTANCE = new TriconInfotechEager();

	private TriconInfotechEager() {
		 System.out.println("Inside TriconInfotechEager() constructor");
	}

	public static TriconInfotechEager getInstance() {
		return INSTANCE;
	}

}
