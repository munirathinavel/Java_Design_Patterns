package com.pattern.creational.prototype;

public class ShallowCopyStrategy implements CloneStrategy {

	@Override
	public Employee cloneObject(Employee employee) throws Exception {
		System.out.println("\nCreating Shallow copy of Employee object ..");
		return (Employee) employee.clone();
	}

}
