package com.pattern.creational.singleton;

public class TriconInfotechEagerStaticBlock extends Organization {
	private static final TriconInfotechEagerStaticBlock INSTANCE;

	static {
		try {
			INSTANCE = new TriconInfotechEagerStaticBlock();
		} catch (Exception ex) {
			throw new RuntimeException("Error while initializing TriconInfotechEagerStaticBlock!");
		}
	}

	private TriconInfotechEagerStaticBlock() {
		System.out.println("Inside TriconInfotechEagerStaticBlock() constructor");
	}

	public static TriconInfotechEagerStaticBlock getInstance() {
		return INSTANCE;
	}

}
