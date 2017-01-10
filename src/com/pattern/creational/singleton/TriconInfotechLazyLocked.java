package com.pattern.creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TriconInfotechLazyLocked extends Organization {
	private static final Lock instanceLock = new ReentrantLock();

	private static TriconInfotechLazyLocked instance = null;

	private TriconInfotechLazyLocked() {
		System.out.println("Inside TriconInfotechLazyLocked() constructor");
	}

	public static TriconInfotechLazyLocked getInstance() {
		instanceLock.tryLock();
		try {
			return (instance == null) ? instance = new TriconInfotechLazyLocked() : instance;
		} finally {
			instanceLock.unlock();
		}
	}

}
