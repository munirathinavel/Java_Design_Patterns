package com.pattern.creational.singleton;

import java.util.List;

public class SingletonPatternDemo {

	private static enum SingletonInstanceType {
		EAGER, EAGER_STAIC_BLOCK, LAZY_HOLDER, LAZY_SYNCHRONIZED, LAZY_LOCKED
	}

	public static void main(String[] args) {
		final Organization organization = getTriconInfotech(SingletonInstanceType.LAZY_LOCKED);
		organization.addEmployee(getNewEmployee());
		organization.addEmployee(getNewEmployee());
		organization.addEmployee(getNewEmployee());

		List<Employee> allEmployees = organization.getAllEmployees();
		System.out.println("\nEmployees list (before removal): ");
		print(allEmployees);

		organization.removeEmployee(allEmployees.get(0).getId());
		allEmployees = organization.getAllEmployees();

		System.out.println("\nEmployees list (after removal): ");
		print(allEmployees);
	}

	private static Organization getTriconInfotech(SingletonInstanceType instanceType) {
		System.out.println("Getting TriconInfotech instance ..");
		Organization organization = null;
		switch (instanceType) {
			case EAGER:
				organization = TriconInfotechEager.getInstance();
				break;
			case EAGER_STAIC_BLOCK:
				organization = TriconInfotechEagerStaticBlock.getInstance();
				break;
			case LAZY_HOLDER:
				organization = TriconInfotechLazyHolder.getInstance();
				break;
			case LAZY_SYNCHRONIZED:
				organization = TriconInfotechLazySynchronized.getInstance();
				break;
			case LAZY_LOCKED:
				organization = TriconInfotechLazyLocked.getInstance();
				break;
		}
		return organization;
	}

	private static Employee getNewEmployee() {
		long empId = System.nanoTime();
		return new Employee(empId, "Employee-" + empId);
	}

	private static void print(final List<Employee> allEmployees) {
		if (allEmployees != null) {
			for (Employee employee : allEmployees) {
				System.out.println(employee);
			}
		}
	}

}
