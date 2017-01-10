package com.pattern.structural.fecade.employee;

import java.util.concurrent.atomic.AtomicLong;

public final class EmployeeIdGenerator {
	private static AtomicLong empId = new AtomicLong(0);

	private EmployeeIdGenerator() {
	}

	public static final long getNextEmpId() {
		return empId.incrementAndGet();
	}

}
